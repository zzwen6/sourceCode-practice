package top.hting.spider.thread;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import top.hting.spider.model.UrlPath;

import java.io.IOException;

/**
 * 生产者
 */
public class Producer extends AbstractProducer<UrlPath> {


    public Producer(int capacity, int consumers) {
        super(capacity);
        // 初始化线程，然后再执行生产
        AbstractConsumer consumer = new Consumer(queue);
        consumerThread(consumers, consumer);

        // produceProduct(url);
    }

    public void produceProduct(String url) {
        // 解析url，然后将解析后要处理的url 添加到队列

        // 1. 解析每页的url获取到列表url
        try {
            Document document = Jsoup.connect(url).get();
            Element resultListEle = document.getElementById("resultList");

            Elements elements = resultListEle.select("div[class=el]").select("p[class=t1]").select("span").select("a");

            for (Element element : elements) {

                String href = element.attr("href");

                UrlPath urlPath = new UrlPath();
                urlPath.setUrl(href);
                urlPath.setPublishDate("");
                urlPath.setCompany("");
                while (!put(urlPath)){}
            }






        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
