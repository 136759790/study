# Spring事务
## 传播机制
+ propagation_required：当前方法必须在一个事务中执行，之前有事务就沿用之前的事务，没有事务就起一个事务。
+ propagation_requires_new：当前方法必须在新事务中执行。前方法有事务就挂起，新启事务。
+ propagation_supports：支持事务，前方法有就用，没有就不用。
+ propagation_mandatory：必须在事务中执行，前方法如果没有事务就抛异常。
+ propagation_nested：在嵌套事务中运行，外层事务异常回滚了，内层必须回滚，反之，内层事务不影响外层事务。
+ propagation_never：必须在非事务的方法中执行，如果存在事务，抛异常。
+ propagation_not_supported：该方法不应该在一个事务中运行。如果有一个事务正在运行，他将在运行期被挂起，直到这个事务提交或者回滚才恢复执行
## 事务声明方式
+ @Transactional注解方式声明事务。注意内部调用不会被代理。
+ 基于XML配置事务，配置切面。
+ 基于TransactionProxyFactoryBean 代码方式配置事务。
+ 基于拦截器TransactionInterceptor
## 事务实现原理
    spring事务管理使用的是基于apo的动态代理模式，动态代理又分为两种
+ 基于jdk的接口的方式代理
+ 基于cglib的子类的方式代理