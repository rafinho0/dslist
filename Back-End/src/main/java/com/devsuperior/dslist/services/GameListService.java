package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	@Transactional
	// Metodo para mover os jogos da lista com base na lista, posicao inicial e destino
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		// Procuraremos qual parte da lista queremos (1 ou 2)
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		// Removeremos o objeto da posicao inicial
		GameMinProjection obj = list.remove(sourceIndex);
		// Adicionamremos o obj que removemos na posicao de destino
		list.add(destinationIndex, obj);
		
		// Se source for menor, entao a posicao dele sera a minima, caso contario, destination sera menor (min)
		// Ex: 3 < 5 ? 3 (verdade) : 5 (falso) => min = 3
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		
		// Se source for menor, entao max sera a posicao de destino, caso contrario, quer dizer que source eh maior
		// Ex: 3 < 5? 5 (verdade) : 3 (falso) => max = 5
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		// Nesse caso, pegaremos o listId, o gameId e a posicao que queremos coloca-lo no BD
		// No caso abaixo, a posicao dos elementos NA MEMORIA ja esta correta
		// Dessa forma, so iremos persistir as informacoes no banco de dados
		// Ou seja, passamos o listId, o gameId (do jogo na MEMORIA) e a PROPRIA posicao dele na memoria para o BD
		for(int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
}
