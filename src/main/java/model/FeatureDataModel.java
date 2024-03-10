package model;

/*
 feature data model to read baseUrl and BasePath for now from data.json file
 this can be expanded and the project grows
 */

public class FeatureDataModel {
    private String cocktailDbEndpoint;
    private String cocktailDbBasePath;

    public String getCocktailDbEndpoint() {
        return cocktailDbEndpoint;
    }
    public String getCocktailDbBasePath() {
        return cocktailDbBasePath;
    }

}
