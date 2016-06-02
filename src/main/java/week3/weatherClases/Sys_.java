
package week3.weatherClases;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sys_ {

    @SerializedName("pod")
    @Expose
    public String pod;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sys_() {
    }

    /**
     * 
     * @param pod
     */
    public Sys_(String pod) {
        this.pod = pod;
    }

}
