package tests;

import apiCalls.SearchIngredients;
import model.Ingredient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class SearchIngredientsByNameTest {


    @Test(description = "Verify Cocktail DB is able to search an ingredient by provided name and return specific fields.")
    public void userShouldBeAbleToSearchIngredientByNameAndValidateResponse() throws IOException {
        String ingredientsName = "Vodka";
        String descriptions = "Vodka is a distilled beverage " +
                "composed primarily of water and ethanol";
        //get searchIngredientByName method
        Ingredient ingredients = SearchIngredients.searchIngredientByName(ingredientsName);
        /*
            assert following attributes.
            Ingredient ID (string),
            Ingredient (string),
            Description (string),
            Type (string),
            Alcohol (string) and
            ABV (string).
         */
        assert ingredients != null;
        Assert.assertEquals(ingredients.getId(), "1");
        Assert.assertEquals(ingredients.getName(), ingredientsName);
        assertTrue(ingredients.getDescription().contains(descriptions),
                "Provided description does not contain provided text: '" + descriptions + "'  ");
        Assert.assertEquals(ingredients.getType(), ingredientsName);
        Assert.assertEquals(ingredients.getAlcoholContent(), "Yes");
        Assert.assertEquals(ingredients.getAbv(), "40");

    }

    @Test(description = "Verify an ingredient is non-alcoholic, Alcohol is null and ABV is null")
    public void verifyIfIngredientIsNonAlcoholicVerifyResponse() {

        //define non-alcoholic ingredient variable
        String nonAlcoholicIngredient = "Orange";
        //get searchByName method from
        Ingredient ingredient = SearchIngredients.searchIngredientByName(nonAlcoholicIngredient);
        /*
            check provided method if it's value is null,
            if true, assert, alcohol = no and ABV = null
         */
        assert ingredient != null;
        if (ingredient.getName().equalsIgnoreCase("No")) {

            assertTrue(ingredient.getAlcoholContent().equalsIgnoreCase("No"));
            assertNull(ingredient.getAbv(),
                    "ABV should be null for an non-alcoholic ingredient:" +
                            " '" + ingredient.getAbv() + "' ");

        } else {
            assertTrue(ingredient.getName().equalsIgnoreCase(nonAlcoholicIngredient),
                    "Alcohol content should be No");
        }
    }
    @Test(description = "Verify a user can search by ingredient with alcoholic," +
            "then Alcohol is Yes and ABV is null")
    public void verifyIfIngredientIsAlcoholicVerifyResponse() {

        //define non-alcoholic ingredient variable
        String alcoholicIngredient = "Vodka";
        //get searchByName method from
        Ingredient ingredient = SearchIngredients.searchIngredientByName(alcoholicIngredient);
        /*
            check provided ingredient contains yes
            if true, assert, alcohol = no and ABV = null
         */
        assert ingredient != null;
        if (ingredient.getName().equalsIgnoreCase("Yes")) {

            assertTrue(ingredient.getAlcoholContent().equalsIgnoreCase("Yes"),
                    "Alcohol content should be Yes");
            assertNotNull(ingredient.getAbv(),
                    "ABV should not be null for an alcoholic ingredient: '" + ingredient.getAbv() + "' ");

        } else {
            assertTrue(ingredient.getAlcoholContent().equalsIgnoreCase("Yes"),
                    "Alcohol content should not be Yes");
        }
    }


}
