package cocktailDBAPI;

import io.restassured.response.Response;
import model.Ingredient;
import model.Ingredients;
import org.testng.annotations.Test;
import utils.DataFileReaderUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static apiCalls.SearchIngredients.getIngredientsByName;

public class SearchingIngredients {
    @Test
    public void userShouldBeAbleToSearchIngredientsUsingIngredientsName() throws IOException {
        String ingredientsName = "vodka";
        Response httpResponse = getIngredientsByName(ingredientsName);

        System.out.println(httpResponse.getBody().asString());
        Ingredients deserializeJsonIngredientResponse = DataFileReaderUtils.deserializeJsonResponse(httpResponse);

        assert deserializeJsonIngredientResponse != null;
        List<Ingredient> ingredients = deserializeJsonIngredientResponse.getIngredients();
        System.out.println("Ingredient Description: " + ingredients.get(0).getDescription());

    }

}
