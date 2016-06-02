package week4.chat.server;

import week4.chat.client.Client;
import week4.chat.server.Server;

/**
 * Created by Iurii on 01.06.2016.
 */
public class TestServer {
    public static void main(String[] args) {
        Server server = new Server();
        server.run();

        System.out.println(server.getList().get(0).toString());


    }
}
