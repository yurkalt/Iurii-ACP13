package week3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import week3.weatherClases.Example;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Iurii on 28.05.2016.
 */
public class TestWeather {
    public TestWeather() {
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = new URI("http://api.openweathermap.org/data/2.5/forecast/city?id=693457&APPID=6fb8199d11676c9a54c773d3687bada8");
        URL url = uri.toURL();
        InputStream is = url.openStream();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(is));

        StringBuilder sb = new StringBuilder();

        String line = "";

        while((line = bufferedReader.readLine()) != null){
            sb.append(line);
        }

        String json = sb.toString();

        Gson gson = new GsonBuilder().create();
        Example example = gson.fromJson(json, Example.class);
    }
}
