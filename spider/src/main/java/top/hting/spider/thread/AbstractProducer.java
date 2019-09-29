package top.hting.spider.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class AbstractProducer<E> {



    protected BlockingQueue<E> queue;
    BlockingQueue<Runnable> runnables = new LinkedBlockingQueue<>();
    protected ExecutorService executorService = new ThreadPoolExecutor(4, 16, 10, TimeUnit.SECONDS,runnables );


    public AbstractProducer(int capacity){
        initQueue(capacity);
    }

    protected boolean put(E e){
        return queue.offer(e);
    }

    private void initQueue(int capacity){

        if (queue == null) {
            synchronized (this) {
                if (queue == null) {
                    queue = new LinkedBlockingQueue<>(capacity>0?capacity:16);
                }
            }
        }

    }

    protected void consumerThread(int consumers, AbstractConsumer<E> consumer) {
        for (int i=0; i<consumers; i++) {
            executorService.execute(consumer);
        }
    }


}
