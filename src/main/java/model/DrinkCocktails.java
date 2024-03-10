package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrinkCocktails {
    @JsonProperty("drinks")
    private List<Drink> drinks;

    @JsonProperty("drinks")
    public List<Drink> getDrinks() {
        return drinks;
    }
}
