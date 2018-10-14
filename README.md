# 记录生活中java知识
## map
+ hashMap的容量为什么是2幂次：因为平均分配大体思想是取余，但是位运算比取余快得多，只有容量是2的幂次时，h & (length - 1) == h % length
## java集合
## 多线程
## mybatis
### 问题
+ 插入的时候字段为String数据库为DateTime类型
   + 直接插入会报错，数据类型转换失败，需要插入的时候指定jdbctype，insert into String2Date values(#{starttime,jdbcType=TIMESTAMP},#{endtime})
## SPRING
### bean的创建方式
1. 构造方法创建bean
   + 无参构造函数+setter方法注入属性
   + 有参构造函数直接注入
2. 实例工厂
   + 实例工厂需要先创建工厂，再利用工厂类的创造方法创造bean
3. 静态工厂
   + 利用工厂类中的静态方法创建对象，注入到bean容器中。
### Spring拦截器和Servlet过滤器的区别
   1. 拦截器基于java的反射机制（AOP），过滤器基于函数回调。
   2. 拦截器不依赖Servlet，可以用于方法中，过滤器依赖Servlet，只能拦截处理Servlet的请求。
   3. Filter运行在Servlet之前所以运行在拦截器之前。
## TCP协议
+ 三次握手
   + client 发送（SYN）连接请求（seq=x），自身进入syn_end状态。
   + server 收到SYN报文，回应一个SYN（seq=y）和ack(ack=x+1)报文，Server进入SYN_RECV状态。
   + client 收到server报文验证seq，回应一个ack（ack=y+1）,进入连接状态。
+ 四次挥手，因为全双工，所以需要两端都拆除连接。
   + client 发送结束命令（FIN）到server，关闭client到server的连接。（client单方面关闭）
   + server 收到结束命令（FIN）后，返回给client一个ACK(FIN+1)。
   + server 发送一个结束命令（FIN）给client，关闭server到client的连接。（server单方面关闭）
   + client 收到结束命令（FIN）后，返回给server一个ACK（FIN+1）。

