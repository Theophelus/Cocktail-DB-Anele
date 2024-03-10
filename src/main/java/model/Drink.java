package model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Drink {

    @JsonProperty("idDrink")
    private String idDrink;
    @JsonProperty("strDrink")
    private String strDrink;
    @JsonProperty("strDrinkAlternate")
    private Object strDrinkAlternate;
    @JsonProperty("strTags")
    private String strTags;
    @JsonProperty("strVideo")
    private Object strVideo;
    @JsonProperty("strCategory")
    private String strCategory;
    @JsonProperty("strIBA")
    private String strIBA;
    @JsonProperty("strAlcoholic")
    private String strAlcoholic;
    @JsonProperty("strGlass")
    private String strGlass;
    @JsonProperty("strInstructions")
    private String strInstructions;
    @JsonProperty("strInstructionsES")
    private Object strInstructionsES;
    @JsonProperty("strInstructionsDE")
    private String strInstructionsDE;
    @JsonProperty("strInstructionsFR")
    private Object strInstructionsFR;
    @JsonProperty("strInstructionsIT")
    private String strInstructionsIT;
    @JsonProperty("strInstructionsZH-HANS")
    private Object strInstructionsZHHANS;
    @JsonProperty("strInstructionsZH-HANT")
    private Object strInstructionsZHHANT;
    @JsonProperty("strDrinkThumb")
    private String strDrinkThumb;
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @JsonProperty("strIngredient5")
    private Object strIngredient5;
    @JsonProperty("strIngredient6")
    private Object strIngredient6;
    @JsonProperty("strIngredient7")
    private Object strIngredient7;
    @JsonProperty("strIngredient8")
    private Object strIngredient8;
    @JsonProperty("strIngredient9")
    private Object strIngredient9;
    @JsonProperty("strIngredient10")
    private Object strIngredient10;
    @JsonProperty("strIngredient11")
    private Object strIngredient11;
    @JsonProperty("strIngredient12")
    private Object strIngredient12;
    @JsonProperty("strIngredient13")
    private Object strIngredient13;
    @JsonProperty("strIngredient14")
    private Object strIngredient14;
    @JsonProperty("strIngredient15")
    private Object strIngredient15;
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @JsonProperty("strMeasure4")
    private Object strMeasure4;
    @JsonProperty("strMeasure5")
    private Object strMeasure5;
    @JsonProperty("strMeasure6")
    private Object strMeasure6;
    @JsonProperty("strMeasure7")
    private Object strMeasure7;
    @JsonProperty("strMeasure8")
    private Object strMeasure8;
    @JsonProperty("strMeasure9")
    private Object strMeasure9;
    @JsonProperty("strMeasure10")
    private Object strMeasure10;
    @JsonProperty("strMeasure11")
    private Object strMeasure11;
    @JsonProperty("strMeasure12")
    private Object strMeasure12;
    @JsonProperty("strMeasure13")
    private Object strMeasure13;
    @JsonProperty("strMeasure14")
    private Object strMeasure14;
    @JsonProperty("strMeasure15")
    private Object strMeasure15;
    @JsonProperty("strImageSource")
    private String strImageSource;
    @JsonProperty("strImageAttribution")
    private String strImageAttribution;
    @JsonProperty("strCreativeCommonsConfirmed")
    private String strCreativeCommonsConfirmed;
    @JsonProperty("dateModified")
    private String dateModified;

    @JsonProperty("idDrink")
    public String getIdDrink() {
        return idDrink;
    }
    @JsonProperty("strDrink")
    public String getStrDrink() {
        return strDrink;
    }
    @JsonProperty("strDrinkAlternate")
    public Object getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    @JsonProperty("strTags")
    public String getStrTags() {
        return strTags;
    }

    @JsonProperty("strVideo")
    public Object getStrVideo() {
        return strVideo;
    }

    @JsonProperty("strCategory")
    public String getStrCategory() {
        return strCategory;
    }

    @JsonProperty("strIBA")
    public String getStrIBA() {
        return strIBA;
    }

    @JsonProperty("strAlcoholic")
    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    @JsonProperty("strGlass")
    public String getStrGlass() {
        return strGlass;
    }

    @JsonProperty("strInstructions")
    public String getStrInstructions() {
        return strInstructions;
    }

    @JsonProperty("strInstructionsES")
    public Object getStrInstructionsES() {
        return strInstructionsES;
    }

    @JsonProperty("strInstructionsDE")
    public String getStrInstructionsDE() {
        return strInstructionsDE;
    }

    @JsonProperty("strInstructionsFR")
    public Object getStrInstructionsFR() {
        return strInstructionsFR;
    }
    @JsonProperty("strInstructionsIT")
    public String getStrInstructionsIT() {
        return strInstructionsIT;
    }
    @JsonProperty("strInstructionsZH-HANS")
    public Object getStrInstructionsZHHANS() {
        return strInstructionsZHHANS;
    }
    @JsonProperty("strInstructionsZH-HANT")
    public Object getStrInstructionsZHHANT() {
        return strInstructionsZHHANT;
    }
    @JsonProperty("strDrinkThumb")
    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }
    @JsonProperty("strIngredient1")
    public String getStrIngredient1() {
        return strIngredient1;
    }
    @JsonProperty("strIngredient2")
    public String getStrIngredient2() {
        return strIngredient2;
    }

    @JsonProperty("strIngredient3")
    public String getStrIngredient3() {
        return strIngredient3;
    }

    @JsonProperty("strIngredient4")
    public String getStrIngredient4() {
        return strIngredient4;
    }

    @JsonProperty("strIngredient5")
    public Object getStrIngredient5() {
        return strIngredient5;
    }

    @JsonProperty("strIngredient6")
    public Object getStrIngredient6() {
        return strIngredient6;
    }

    @JsonProperty("strIngredient7")
    public Object getStrIngredient7() {
        return strIngredient7;
    }
    @JsonProperty("strIngredient8")
    public Object getStrIngredient8() {
        return strIngredient8;
    }
    @JsonProperty("strIngredient9")
    public Object getStrIngredient9() {
        return strIngredient9;
    }

    @JsonProperty("strIngredient10")
    public Object getStrIngredient10() {
        return strIngredient10;
    }

    @JsonProperty("strIngredient11")
    public Object getStrIngredient11() {
        return strIngredient11;
    }
    @JsonProperty("strIngredient12")
    public Object getStrIngredient12() {
        return strIngredient12;
    }
    @JsonProperty("strIngredient13")
    public Object getStrIngredient13() {
        return strIngredient13;
    }

    @JsonProperty("strIngredient14")
    public Object getStrIngredient14() {
        return strIngredient14;
    }
    @JsonProperty("strIngredient15")
    public Object getStrIngredient15() {
        return strIngredient15;
    }

    @JsonProperty("strMeasure1")
    public String getStrMeasure1() {
        return strMeasure1;
    }

    @JsonProperty("strMeasure2")
    public String getStrMeasure2() {
        return strMeasure2;
    }

    @JsonProperty("strMeasure3")
    public String getStrMeasure3() {
        return strMeasure3;
    }
    @JsonProperty("strMeasure4")
    public Object getStrMeasure4() {
        return strMeasure4;
    }
    @JsonProperty("strMeasure5")
    public Object getStrMeasure5() {
        return strMeasure5;
    }

    @JsonProperty("strMeasure6")
    public Object getStrMeasure6() {
        return strMeasure6;
    }

    @JsonProperty("strMeasure7")
    public Object getStrMeasure7() {
        return strMeasure7;
    }

    @JsonProperty("strMeasure8")
    public Object getStrMeasure8() {
        return strMeasure8;
    }

    @JsonProperty("strMeasure9")
    public Object getStrMeasure9() {
        return strMeasure9;
    }
    @JsonProperty("strMeasure10")
    public Object getStrMeasure10() {
        return strMeasure10;
    }
    @JsonProperty("strMeasure11")
    public Object getStrMeasure11() {
        return strMeasure11;
    }

    @JsonProperty("strMeasure12")
    public Object getStrMeasure12() {
        return strMeasure12;
    }

    @JsonProperty("strMeasure13")
    public Object getStrMeasure13() {
        return strMeasure13;
    }
    @JsonProperty("strMeasure14")
    public Object getStrMeasure14() {
        return strMeasure14;
    }

    @JsonProperty("strMeasure15")
    public Object getStrMeasure15() {
        return strMeasure15;
    }

    @JsonProperty("strImageSource")
    public String getStrImageSource() {
        return strImageSource;
    }

    @JsonProperty("strImageAttribution")
    public String getStrImageAttribution() {
        return strImageAttribution;
    }

    @JsonProperty("strCreativeCommonsConfirmed")
    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }
    @JsonProperty("dateModified")
    public String getDateModified() {
        return dateModified;
    }

}