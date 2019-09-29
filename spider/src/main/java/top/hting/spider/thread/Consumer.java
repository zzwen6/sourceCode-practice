package top.hting.spider.thread;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import top.hting.spider.model.UrlPath;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;

@Slf4j
public class Consumer extends AbstractConsumer<UrlPath> {

    public Consumer(BlockingQueue<UrlPath> queue) {
        super(queue);
    }

    @Override
    protected void consume(UrlPath model) {
        // jsoup获取链接内容
        // System.out.println(model.getUrl());
        Thread thread = Thread.currentThread();
        // log.info("线程名:{}", thread.getName());
        String url = model.getUrl();
        try {
            Document document = Jsoup.connect(url).get();
            // 解析公司名

            // 解析职位

            // 解析发布日期

            // 解析职位要求
            Element jobMsg = document.getElementsByClass("job_msg").get(0);
            System.out.println(jobMsg.text());
            System.out.println("-----------------");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
