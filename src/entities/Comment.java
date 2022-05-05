package entities;

import java.security.PublicKey;

public class Comment {

    private String text;

    public Comment() {
    }

    public Comment(String comment) {
        this.text = comment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
