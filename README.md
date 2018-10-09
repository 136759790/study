# 记录生活中java知识
## java集合
## 多线程
## mybatis
### 问题
+ 插入的时候字段为String数据库为DateTime类型
   + 直接插入会报错，数据类型转换失败，需要插入的时候指定jdbctype，insert into String2Date values(#{starttime,jdbcType=TIMESTAMP},#{endtime})
## spring
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

