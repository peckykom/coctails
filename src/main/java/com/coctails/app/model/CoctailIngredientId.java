package com.coctails.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CoctailIngredientId implements Serializable {


	@Column(name = "coctailId")
	private Long coctailId;

	@Column(name = "ingredientId")
	private Long ingredientId;

	public CoctailIngredientId() {
		super();
	}
	
	public CoctailIngredientId(Long coctailId, Long ingredientId) {
		this.coctailId = coctailId;
		this.ingredientId = ingredientId;
	}
}
