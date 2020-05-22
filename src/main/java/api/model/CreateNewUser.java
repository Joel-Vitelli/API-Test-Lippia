package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateNewUser {

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("userID")
    private String userID;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }


}
