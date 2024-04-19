package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 feature data model to read baseUrl and BasePath for now from data.json file
 this can be expanded and the project grows
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureDataModel {
    private String cocktailDbBaseURL;
    private String cocktailDbBasePath;

    public String getCocktailDbBaseURL() {
        return cocktailDbBaseURL;
    }
    public String getCocktailDbBasePath() {

        return cocktailDbBasePath;
    }

}
