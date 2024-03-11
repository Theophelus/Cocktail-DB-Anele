package tests;
import apiCalls.SearchingCocktailByName;
import io.qameta.allure.*;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import model.Drink;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static utils.DataFileReaderUtils.readJsonSchema;

public class SearchByCocktailTests {

    @Test(description = "Verify Cocktail DB response corresponds with cocktailJsonSchema properties")
    @Story("GET request with valid json response")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Anele Tom")
    @Link(name = "Website", url = " https://www.thecocktaildb.com/")
    @Description("Test Description: Verify Cocktail DB response corresponds with cocktailJsonSchema properties")
    public void validateCocktailJsonResponseAgainstJsonSchema() throws IOException {

        Map<String, String> margarita = new HashMap<>();
        margarita.put("s", "Margarita");
        String cocktailJsonSchema = "cocktailJsonSchema.json";
        Response httpResponse = SearchingCocktailByName.getCocktailResponse(margarita);
        // Validate response against JSON schema
        httpResponse
                .then()
                .assertThat()
                .statusCode(200)
                .body(JsonSchemaValidator
                .matchesJsonSchema(readJsonSchema(cocktailJsonSchema)));

    }
//
//    @Test(description = "Verify user can search cocktails by name using Cocktail DB API")
//    public void searchCocktailsByName(){
//        //cocktail to search by name
//        String margarita = "Margarita";
//        //get search Cocktail by name method
//        Drink drink = SearchingCocktailByName.searchCockTailByName(margarita);
//        assert drink != null;
//        System.out.println(drink.getStrDrink());
//        //validate json response
//        Assert.assertEquals(drink.getStrDrink(), margarita);
//        Assert.assertNull(drink.getStrDrinkAlternate(),
//                "No alternative drinks for: '"+margarita+"'");
//        Assert.assertEquals(drink.getStrTags(), "IBA,ContemporaryClassic");
//        Assert.assertEquals(drink.getStrCategory(), "Ordinary Drink");
//        Assert.assertEquals(drink.getStrIBA(), "Contemporary Classics");
//        Assert.assertEquals(drink.getStrAlcoholic(), "Alcoholic");
//    }
//
//    @Test(description = "Verify which category is a particular cocktail belong to from Cocktail DB API")
//    public void cocktailBelongToWhichCategory(){
//        String cocktail = "Margarita";
//        Drink drink = SearchingCocktailByName.searchCockTailByName(cocktail);
//
//        assert drink != null;
//        Assert.assertTrue(drink.getStrCategory().equalsIgnoreCase("Ordinary Drink"));
//
//    }

}
