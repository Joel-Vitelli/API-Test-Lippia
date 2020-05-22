package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("userId")
    private int userId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("completes")
    private boolean completes;

    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

}
