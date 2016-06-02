package week4.chat.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Iurii on 30.05.2016.
 */
public class Server {

    private static final Logger LOGGER = Logger.getLogger(Server.class);

    public Server() {
        list = new ArrayList<MessageServer>();
    }


    private int id;

    public List<MessageServer> getList() {
        return list;
    }

    private List<MessageServer> list;

    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(1111);
            Socket client = serverSocket.accept();

            LOGGER.info("Server is running.");

            InputStream is = client.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is));

            StringBuilder sb = new StringBuilder();

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }

            String json = sb.toString();

            Gson gson = new GsonBuilder().create();
            MessageServer messageServer = gson.fromJson(json, MessageServer.class);

            list.add(messageServer);

            LOGGER.info("Message received!");

            is.close();
            serverSocket.close();
            client.close();


        } catch (IOException e) {
            LOGGER.error("Connection reset");
            e.printStackTrace();
        }
    }

}
