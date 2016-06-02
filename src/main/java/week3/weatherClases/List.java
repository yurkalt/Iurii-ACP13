
package week3.weatherClases;

import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import week3.TestWeather;

@Generated("org.jsonschema2pojo")
public class List {

    @SerializedName("dt")
    @Expose
    public Integer dt;
    @SerializedName("main")
    @Expose
    public Main main;
    @SerializedName("weather")
    @Expose
    public java.util.List<TestWeather> weather = new ArrayList<TestWeather>();
    @SerializedName("clouds")
    @Expose
    public Clouds clouds;
    @SerializedName("wind")
    @Expose
    public Wind wind;
    @SerializedName("rain")
    @Expose
    public Rain rain;
    @SerializedName("sys")
    @Expose
    public Sys_ sys;
    @SerializedName("dt_txt")
    @Expose
    public String dtTxt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public List() {
    }

    /**
     * 
     * @param clouds
     * @param dt
     * @param wind
     * @param sys
     * @param dtTxt
     * @param weather
     * @param rain
     * @param main
     */
    public List(Integer dt, Main main, java.util.List<TestWeather> weather, Clouds clouds, Wind wind, Rain rain, Sys_ sys, String dtTxt) {
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.rain = rain;
        this.sys = sys;
        this.dtTxt = dtTxt;
    }

}
