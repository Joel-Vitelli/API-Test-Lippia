package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("userId")
    private int userId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;

    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompletes() {
        return body;
    }


}
