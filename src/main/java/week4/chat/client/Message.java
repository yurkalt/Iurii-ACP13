package week4.chat.client;

/**
 * Created by Iurii on 01.06.2016.
 */
public class Message {
    private String nickname="Clien1";
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMessage() {
        return message;
    }
}
