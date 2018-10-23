# 数据结构
# 数组
> 数组是一块连续的内存，get和set都是O(1),add 和remove都是O(N)。
java中的实现类是 ArrayList。
# 链表
> 链表是一块非连续内存，get set是O（N），add和remove是O（1）的，需要额外空间储存指针。
Java中使用LinkedList作为默认实现。
# 队列
> 队列是一种FIFO的特殊线性表，只允许在头部和尾部进行操作。还提供优先级队列。
Java中Queue接口下的实现类是队列的实现。
# 栈
> 栈是一种LIFO的线性表
Java中Stack实现了这种特性，同时集成Vector，同时具有线程安全和效率低下的特性，JDK8提供了Deque实现栈。
# 集合(SET)
> 不重复
+ HashSet：在HashMap的基础上创建，元素为HashMap的可以，值为new Object()。
~~~
    //添加元素
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    //value默认值
    private static final Object PRESENT = new Object();
~~~
+ LinkedHashSet:继承自HashSet，使用HashCode确定在集合中位置，链表确定顺序。
~~~

~~~
+ TreeSet：实现SortedSet接口，基于TreeMap，查找快，操作慢，维护顺序。
## 散列表，哈希表
> 基于哈希的数据类型，典型的就是HashMap数组+链表+红黑树完成。
+ HashMap：数组+链表+红黑树（JDK8）
+ HashTable：线程安全（基于synchronized）
+ ConcurrentHashMap：线程安全，分段加锁。
+ TreeMap：实现TreeMap，有序。
+ LinkedHashMap：记录key的插入顺序。
+ WeakHashMap：对key的弱引用。