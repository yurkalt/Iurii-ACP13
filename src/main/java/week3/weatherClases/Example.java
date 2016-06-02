
package week3.weatherClases;

import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("city")
    @Expose
    public City city;
    @SerializedName("cod")
    @Expose
    public String cod;
    @SerializedName("message")
    @Expose
    public Double message;
    @SerializedName("cnt")
    @Expose
    public Integer cnt;
    @SerializedName("list")
    @Expose
    public java.util.List<List> list = new ArrayList<List>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param message
     * @param cnt
     * @param cod
     * @param list
     * @param city
     */
    public Example(City city, String cod, Double message, Integer cnt, java.util.List<List> list) {
        this.city = city;
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
    }

}
