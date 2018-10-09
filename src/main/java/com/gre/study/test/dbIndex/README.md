# 数据库索引介绍
## mysql
+ 索引分类
   + primary 主键索引，随主键创建的索引，一个表只能有一个主键。
   + normal 普通索引，没有限制，可为空，可重复。
   + Unique 唯一索引，可为空，必须唯一。
   + fullText 全文索引，目前仅myIsam引擎支持，字段只能为char varchar text类型。为了解决like '%name%' 这种不使用索引的问题。
+ 索引代价
   + 增加索引文件，增加磁盘占用。
   + 插入、修改、删除操作会引起索引变化，所以性能会下降。
+ 列是否适合添加索引
   + 频繁作为查询条件的列适合作为索引。
   + 唯一性较差的不适合作为索引，比如性别等过滤后扔有大量数据。
   + 更新频繁的不适合座位索引，重建索引耗费性能。
+ 慢查询查找 [传送门](https://blog.csdn.net/wuseyukui/article/details/71512793)
   + explain select * from a 查看执行计划。id select_type table type ....
      + id 如果是子查询，id代表查询的优先级。
      + select_type 查询的类型，主要是用于区分普通查询、联合查询、子查询等复杂的查询
      + table 表名称
      + type 查询种类（重要），system > const > eq_ref > ref > fulltext > ref_or_null > index_merge > unique_subquery > index_subquery > range > index > ALL
      + rows 大概能查到的行数
## oracle

