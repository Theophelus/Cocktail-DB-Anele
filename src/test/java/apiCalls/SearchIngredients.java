package apiCalls;

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
import static base.BaseTest.dataFromJsonDataFile;
import static utils.RestUtils.getData;

public class SearchIngredients {

     static String baseUrl = dataFromJsonDataFile.getCocktailDbEndpoint();
    static String basePath = dataFromJsonDataFile.getCocktailDbBasePath();

    public static Response getIngredientsByName(Map<String, String> queryParams) {
        //Build the request
        RequestSpecification httpRequest = RestUtils.getRequestSpecifications(baseUrl, basePath);

        if (httpRequest == null){
            throw new  RuntimeException("HTTP Specification is null");
        }

        return Objects.requireNonNull(getData(httpRequest, SEARCH, queryParams));
    }

    public static Response getIngredientsByName(String params){
        RequestSpecification httpRequest = RestUtils.getRequestSpecifications(baseUrl, basePath);

        if (httpRequest == null){
            throw new  RuntimeException("HTTP Specification is null");
        }
        System.out.println("Response body{}: " + Objects.requireNonNull(getData(httpRequest, SEARCH, params)).getBody().asString());
        return getData(httpRequest, SEARCH, params);

    }

    /*
        Adding the method to search ingredient by name()
        and return ingredient if found else null of Ingredient not found
     */
    public static Ingredient searchIngredientByName(String strIngredient){
        //define a map to hold query params
        Map<String, String> ingredient = new HashMap<>();
        ingredient.put("i", strIngredient);
        //get the response
        Response httpResponse = getIngredientsByName(ingredient);
        //check if response is a success
        if (httpResponse.getStatusCode() !=200){
            return null;
        }
        //deserialize http response
        Ingredients deserializeJsonResponse = DataFileReaderUtils.deserializeJsonResponse(httpResponse);
        //get the list of ingredients
        assert deserializeJsonResponse != null;
        List<Ingredient> ingredients = deserializeJsonResponse.getIngredients();

        //adding a condition when the list is empty
        if (ingredient.isEmpty() || ingredients ==null) {
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
