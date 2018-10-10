# Quartz [传送门](https://www.cnblogs.com/drift-ice/p/3817269.html)
## 角色
+ job任务接口，自己实现子类，实现自己的逻辑
+ trigger   触发器，设置什么时候触发
   + 共性
      1. 都有开始和结束时间，触发的时间范围。
      2. 优先级，同时触发的时候哪个优先。
      3. 错失重发策略，因为某种原因导致某个定时任务错过触发，MisFire的
+ scheduler 任务调度器， 
   + threadpool 线程池
   + jobstore 工作存储器
