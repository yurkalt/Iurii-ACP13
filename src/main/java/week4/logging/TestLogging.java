package week4.logging;


import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

/**
 * Created by Iurii on 31.05.2016.
 */
public class TestLogging {

    public static void main(String[] args) throws IOException {

        Logger parent = Logger.getLogger("week4");
        Logger child = Logger.getLogger("week4.logging");
        Logger child2 = Logger.getLogger(TestLogging.class);

        child2.addAppender(new FileAppender(new XMLLayout(), "log.xml"));

        child2.info("System started...");
    }
}
