package week3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Iurii on 28.05.2016.
 */
public class Ali {

    public static void findPic (String path) throws IOException {

        Document document = Jsoup.connect(path).get();
        Element link = document.select(".picCore.pic-Core-v").first();
        String res = link.attr("src");
        System.out.println(res);

        String pattern = "(.*)\\w+\\.jpg(?!$)";

        Pattern patterObj = Pattern.compile(pattern);

        Matcher match = patterObj.matcher(res);

       if (match.find()) {
           System.out.println(match.group(0));
       }
       else System.out.println("No match");
    }

}
