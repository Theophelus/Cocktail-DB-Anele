package apiCalls;

import base.BaseTest;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Ingredient;
import model.Ingredients;
import utils.DataFileReaderUtils;
import utils.RestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static utils.PathBuilderUtils.*;
import static utils.RestUtils.getData;

public class SearchIngredientsByName extends BaseTest {

    public static Response getIngredientsResponse(Map<String, String> queryParams) {
        String baseUrl = readJsonFile().getCocktailDbBaseURL();
        String basePath = readJsonFile().getCocktailDbBasePath();

        //Build the request
        RequestSpecification httpRequest = RestUtils.getRequestSpecifications(baseUrl, basePath);

        if (httpRequest == null) {
            throw new RuntimeException("HTTP Specification is null");
        }

        return Objects.requireNonNull(getData(httpRequest, SEARCH, queryParams));

    }

    /*
        Adding the method to search ingredient by name()
        and return ingredient if found else null of Ingredient not found
     */
    public static Ingredient searchIngredientByName(String strIngredient) {
        //define a map to hold query params
        Map<String, String> ingredient = new HashMap<>();
        ingredient.put("i", strIngredient);
        //get the response
        Response httpResponse = getIngredientsResponse(ingredient);
        //check if response is a success
        if (httpResponse.getStatusCode() != 200) {
            return null;
        }

        //deserialize http response
        Ingredients deserializeJsonResponse =
                DataFileReaderUtils.deserializeJsonResponse(httpResponse, Ingredients.class);

        //get the list of ingredients
        assert deserializeJsonResponse != null;

        List<Ingredient> ingredients = deserializeJsonResponse.getIngredients();

        //adding a condition when the list is empty
        if (ingredient.isEmpty() || ingredients == null) {
            return null;
        }

        // get filter ingredient from list
        if (!ingredients.isEmpty()) {
            for (Ingredient element : ingredients) {
                if (element.getName().equalsIgnoreCase(strIngredient)) {
                    System.out.println("found:" + element.getName());
                    return element;
                }
            }
        }
        //return null of ingredient not round
        System.out.println("Ingredient not found: " + strIngredient);
        return null;
    }
}
