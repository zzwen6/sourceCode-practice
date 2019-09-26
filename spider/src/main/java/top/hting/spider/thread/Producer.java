package top.hting.spider.thread;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import top.hting.spider.model.UrlPath;

import java.io.IOException;
import java.util.concurrent.BlockingDeque;

/**
 *  生产者
 */
public class Producer implements Runnable {

    private BlockingDeque<UrlPath> queue;
    // 初始URL
    private String initUrl;

    public Producer(BlockingDeque<UrlPath> queue, String initUrl) {
        this.queue = queue;
        this.initUrl = initUrl;
    }

    @Override
    public void run() {

        // 1. 解析初始url获取真实需要的url信息
        try {
            Document document = Jsoup.connect(initUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取本页的列表url，可填到队列中

        // 获取分页，然后再


        // 2. 将真实url放入到队列中

    }
}
