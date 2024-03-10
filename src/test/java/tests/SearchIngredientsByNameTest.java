package tests;

import apiCalls.SearchIngredients;
import model.Ingredient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchIngredientsByNameTest {


    @Test(description = "Verify Cocktail DB is able to search an ingredient by provided name and return specific fields.")
    public void userShouldBeAbleToSearchIngredientByNameAndValidateResponse() throws IOException {
        String ingredientsName = "Vodka";
        String descriptions ="Vodka is a distilled beverage " +
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
        Assert.assertTrue(ingredients.getDescription().contains(descriptions),
                "Provided description does not contain provided text: '"+descriptions+"'  ");
        Assert.assertEquals(ingredients.getType(), ingredientsName);
        Assert.assertEquals(ingredients.getAlcoholContent(), "Yes");
        Assert.assertEquals(ingredients.getAbv(), "40");

    }

}
