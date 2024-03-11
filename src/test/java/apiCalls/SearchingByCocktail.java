package apiCalls;

import base.BaseTest;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Drink;
import model.DrinkCocktails;
import utils.DataFileReaderUtils;
import utils.RestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static utils.PathBuilderUtils.SEARCH;
import static utils.PathBuilderUtils.valueOf;
import static utils.RestUtils.getData;

public class SearchingByCocktail extends BaseTest {

    static String baseUrl = dataFromJsonDataFile.getCocktailDbEndpoint();
    static String basePath = dataFromJsonDataFile.getCocktailDbBasePath();

    public static Response getCocktailResponse(Map<String, String> queryParams) {
        //Build the request
        RequestSpecification httpRequest = RestUtils.getRequestSpecifications(baseUrl, basePath);

        if (httpRequest == null){
            throw new  RuntimeException("HTTP Specification is null");
        }
        return Objects.requireNonNull(getData(httpRequest, SEARCH, queryParams));
    }
    /*
        Add a method to search cocktail by name
        and it must return a Drink
     */

    public static Drink searchCockTailByName(String cocktail){
        //regEx to validate string before searching
        String regExs= "^[A-Z].*";
        String current;
        if (!cocktail.matches(regExs)) {
            System.out.println("Cocktail name does not meet validation: Cocktail must start with " +
                    " a capital letter");
            return null;
        }  else {
            current = cocktail;
        }

        //define a map to hold query params
        Map<String, String> drinkBuilder = new HashMap<>();
        drinkBuilder.put("s", current);
        //get http response
        Response httpResponse = getCocktailResponse(drinkBuilder);
        //validate status code
        if (httpResponse.getStatusCode() !=200){
            return null;
        }
        //deserialize http response into Cocktail drink
        DrinkCocktails drinkCocktails = DataFileReaderUtils.cockDeserializeJsonResponse(httpResponse);
        assert drinkCocktails != null;

        //get the list of cocktails
        List<Drink> drinksList = drinkCocktails.getDrinks();
        //If the cocktail does not exist in the cocktail DB, the API shall return drinks as null
        if (drinkBuilder.isEmpty() || drinksList ==null){
            return null;
        }
        //filter drinks a get the one looking for
        if (!drinksList.isEmpty()){
            for (Drink drink: drinksList){
                String currentDrink = drink.getStrDrink();
                if (currentDrink != null && drink.getStrDrink().equalsIgnoreCase(current)){
                    return drink;
                }
            }
        }
        System.out.println("Cocktail not found: " + current);
        return null;
    }
}
