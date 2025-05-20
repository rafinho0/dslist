package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

// Nesta classe, mostraremos apenas os dados minimos, ou seja, 
// o controlador vai receber apenas uma parte dos dados
public class GameMinDTO { 
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	// Construtor que recebera os dados diretamente da entidade Game
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
