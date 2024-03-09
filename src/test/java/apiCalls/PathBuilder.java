package apiCalls;
/*
    path builder enum to handle different routing depending on specifications
 */

public enum PathBuilder {
    SEARCH("/search.ph/"),
    LOOKUP("/lookup.php/");
    private final String path;
    PathBuilder(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
