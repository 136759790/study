# 线程池总结
## 线程池种类
> Executor接口-->ExecutorService接口-->AbstractExecutorService类-->ThreadPoolExecutor类 ，各种线程池都是基于ThreadPoolExecutor实现的静态方法。
+ FixedThreadPool：固定线程大小的线程池。Executors静态方法创建。
~~~
public static ExecutorService newFixedThreadPool(int      nThreads){
    return new ThreadPoolExecutor(nThreads, nThreads,0L, TimeUnit.MILLISECONDS,
    new LinkedBlockingQueue<Runnable>());
}
~~~
+ CachedThreadPool：弹性缓存线程池，刚创建没有线程，随着任务的增加,自动新建线程，有空余的时候不会创建，空闲60s会回收。
~~~
 public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
        60L, TimeUnit.SECONDS,newSynchronousQueue<Runnable>());
}
~~~
+ SingleThreadPool:单线程线程池，队列串行执行。
~~~
public static ExecutorService newSingleThreadExecutor() {
    return new FinalizableDelegatedExecutorService
            (new ThreadPoolExecutor(1, 1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>()));
}
~~~
+ ScheduledThreadPool：
~~~
public ScheduledThreadPoolExecutor(int corePoolSize) {
    super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
              new DelayedWorkQueue());
    }
//创建，使用ScheduledExecutorService引用
ScheduledExecutorService es3 = Executors.newScheduledThreadPool(10);
//使用
public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,long initialDelay,long period,TimeUnit unit);
~~~
## 任务队列种类
+ LingkedBlockingQueue 链表阻塞队列
+ ArrayBlockingQueue 数组阻塞队列
+ SynchronousQueue： 其中每个 put 必须等待一个 take，反之亦然。同步队列没有任何内部容量，甚至连一个队列的容量都没有。 
## 线程池拒绝策略
+ DiscardPolicy：直接丢弃当前要加入的任务。
+ DiscardOldestPolicy:丢弃队列中比较旧的任务。
+ CallerRunsPolicy:调用方线程来执行
+ AbortPolicy:直接拒绝抛异常。
