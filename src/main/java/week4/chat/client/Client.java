package week4.chat.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Iurii on 01.06.2016.
 */
public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class);
  void send() {

      try {
          Socket socket = new Socket("127.0.0.1", 1111);
          PrintWriter pw = new PrintWriter(socket.getOutputStream());

            pw.print(jsonToString() );
            pw.flush();
            pw.close();



          LOGGER.info("Message sent.");



      } catch (IOException e) {
          e.printStackTrace();
      }

  }

   private static String jsonToString() {
       Message m = new Message();

       Scanner s = new Scanner(System.in);
       System.out.println("Input message:");

       m.setMessage(s.nextLine());

       Gson gson = new GsonBuilder().create();
       return gson.toJson(m);




   }

    public static void main(String[] args) {
        System.out.println(jsonToString());


    }

}
