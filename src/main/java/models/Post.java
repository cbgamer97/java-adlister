package models;

public class Post {
    private String title;
    private String body;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String post) {
        this.body = post;
    }

    public Post() {
    }

    public Post(String title, String post) {
        this.title = title;
        this.body = post;
    }

    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }
}
