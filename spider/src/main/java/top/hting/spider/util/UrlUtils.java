package top.hting.spider.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlUtils {

    public static String urlEncodeTwice(String url){
        try {
            String encode = URLEncoder.encode(URLEncoder.encode(url, "utf-8"), "utf-8");
            return encode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return url;

    }


}
