
package week3.weatherClases;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sys {

    @SerializedName("population")
    @Expose
    public Integer population;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sys() {
    }

    /**
     * 
     * @param population
     */
    public Sys(Integer population) {
        this.population = population;
    }

}
