package week2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by serhii on 27.02.16.
 */
public class RunDomParser {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DomParsingUtils.parse(Constants.PATH);
    }
}
