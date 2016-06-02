package week3;

import java.io.IOException;

/**
 * Created by Iurii on 28.05.2016.
 */
public class TestAli {
    public static void main(String[] args) {
        try {
            Ali.findPic("http://ru.aliexpress.com/af/category/202001195.html?spm=2114.31020708.1.1.dw2MZt&isAffiliate=y&site=rus");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
