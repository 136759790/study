# 记录生活中java知识
## java集合
## 多线程
## mybatis
### 问题
+ 插入的时候字段为String数据库为DateTime类型
++ 直接插入会报错，数据类型转换失败，需要插入的时候指定jdbctype，insert into String2Date values(#{starttime,jdbcType=TIMESTAMP},#{endtime})
## spring

