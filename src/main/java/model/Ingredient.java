package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredient {
    @JsonProperty("idIngredient")
    private String id;

    @JsonProperty("strIngredient")
    private String name;

    @JsonProperty("strDescription")
    private String description;

    @JsonProperty("strType")
    private String type;

    @JsonProperty("strAlcohol")
    private String alcohol;

    @JsonProperty("strABV")
    private String abv;


    public Ingredient(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getAlcoholContent() {
        return alcohol;
    }

    public String getAbv() {
        return abv;
    }
}
