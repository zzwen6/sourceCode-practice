package top.hting.spider.thread;

import top.hting.spider.model.UrlPath;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable {
    private BlockingDeque<UrlPath> queue;


    public Consumer(BlockingDeque<UrlPath> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
