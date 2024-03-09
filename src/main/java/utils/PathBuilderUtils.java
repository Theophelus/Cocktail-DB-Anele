package utils;
/*
    path builder enum to handle different routing depending on specifications
 */

public enum PathBuilderUtils {
    SEARCH("search.php/"),
    LOOKUP("lookup.php/");
    private final String path;
    PathBuilderUtils(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
