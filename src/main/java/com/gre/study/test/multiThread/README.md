# 多线程
## 死锁
    两个及以上个进程由于资源竞争或者通信造成的阻塞现象
### 死锁原因
+ 系统资源不足
+ 进程运行顺序不当
+ 资源分配不当
### 死锁条件
+ 互斥条件：进程锁分配到的资源排他性，同一时间段只能由一个进程占用。
+ 请求和保持条件：得到资源的进程需要占用其他资源，而其他资源又被其他进程占用，本线程阻塞，又不释放自身占用的资源。
+ 不剥夺条件：自己获得的资源不能被剥夺，只能自己用完自己释放。
+ 环路等待条件：A等B B等C C等A

