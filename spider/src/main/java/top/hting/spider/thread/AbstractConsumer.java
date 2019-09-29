package top.hting.spider.thread;

import java.util.concurrent.BlockingQueue;

public abstract class AbstractConsumer<E> implements Runnable {
    private BlockingQueue<E> queue;

    public AbstractConsumer(BlockingQueue<E> queue) {
        this.queue = queue;
    }

    protected abstract void consume(E model);

    @Override
    public void run() {
        while (true) {
            try {
                E take = queue.take();
                consume(take);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }




}
