package top.hting.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

public class JsoupTests {

    String url = "https://jobs.51job.com/guangzhou-hpq/117358653.html?s=01&t=0";

    @Test
    public void jsou(){
        try {
            Document document = Jsoup.connect(url).get();

            Elements jobMsg = document.getElementsByClass("job_msg");

            String html = jobMsg.html();

            System.out.println(html);
            Document parse = Jsoup.parse(html);

            Elements p = parse.children();

            for (Element element : p) {

                System.out.println(element.text());

            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
