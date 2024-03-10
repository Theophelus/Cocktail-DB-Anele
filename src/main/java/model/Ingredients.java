package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredients {
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients;

    public Ingredients(){
    }public List<Ingredient> getIngredients() {
        return ingredients;
    }
}