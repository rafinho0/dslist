package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	// Aqui iremos fazer uma query com SQL utilizando a annotation Query
	// Perceba que nao podemos usar ` para renomear os atributos, entao mudamos game_year para gameYear mesmo
	// Caso usasse ` o Postgre nao aceitaria o valor
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	// Aqui passaremos a Projection (que seria a interface que possui os atributos da consulta)
	List<GameMinProjection> searchByList(Long listId);
}
