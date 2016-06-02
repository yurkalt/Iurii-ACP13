package week4.chat.server;

/**
 * Created by Iurii on 01.06.2016.
 */
public class MessageServer {
    public String nickname;
    public String message;

    @Override
    public String toString() {
        return "MessageServer{" +
                "nickname='" + nickname + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
