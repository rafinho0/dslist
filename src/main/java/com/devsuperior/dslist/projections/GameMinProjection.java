package com.devsuperior.dslist.projections;

public interface GameMinProjection {
	
	// Atributos que passamos na Query de GameRepository
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
