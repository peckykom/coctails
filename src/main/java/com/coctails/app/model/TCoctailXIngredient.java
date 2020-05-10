package com.coctails.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "t_coctails_x_ingredients", schema = "co")
public class TCoctailXIngredient implements Serializable {

	@EmbeddedId
    private CoctailIngredientId id;

    @ManyToOne
    @MapsId("coctailId")
    @JoinColumn(name = "coctail_id", nullable = false)
    private TCoctail coctail;
 
    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id", nullable = false)
    private TIngredient ingredient;
    
    public TCoctailXIngredient() {
        super();
    }
}
