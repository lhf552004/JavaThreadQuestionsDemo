# Introduction
This is for Java Thread questions and demo

# 问题

### Runnable and Callable 不同之处
Callable可以返回结果和抛出异常

### 什么是Java内存模型
Java内存模型是一组规则和准则，可让Java程序在多个内存体系结构，CPU和操作系统之间确定性地运行。

在多线程的情况下尤其重要。Java内存模型提供了某种保证，即一个线程所做的更改应对其他线程可见，其中之一是发生在关系之前。

这种关系定义了一些规则，这些规则使程序员可以预期并推理并发Java程序的行为。

## volatile 

volatile表示在变量将被多个线程更新，并且线程不应该缓存在变量的值

volatile保证Happen-before原则，即在被访问之前总是会被更新

[如何使用volatile](https://www.baeldung.com/java-volatile)

## CyclicBarrier and CountDownLatch不同之处
You can reuse CyclicBarrier after the barrier is broken but you cannot reuse CountDownLatch after the count reaches to zero

多个CyclicBarrier可以在同一个Runnable中执行不同的等待，相互之间不影响

CyclicBarrier(java.util.concurrent.CyclicBarrier) is a synchronization mechanism hat can synchronize threads progressing through some algorithm. 
[CyclicBarrier](http://tutorials.jenkov.com/java-util-concurrent/cyclicbarrier.html)

[CountDownLatch](https://www.baeldung.com/java-countdown-latch)

## How to share resources between threads
Can use static objects

Use [BlockingQueue](https://www.jianshu.com/p/b1408e3e3bb4)

## notify vs notifyAll
notify和notifyAll都在java.lang.Object上。

notify只能通知一个thread, 且不能指定

notifyAll通知所有在wait的线程

## Why wait, notify and notifyAll are not inside thread class?
因为java的lock是作用在object级别，而不是线程。

[参考](https://www.liaoxuefeng.com/wiki/1252599548343744/1306580911915042)

## ThreadLocal是什么
ThreadLocal是一个关于创建线程局部变量的类。

通常情况下，我们创建的变量是可以被任何一个线程访问并修改的。

而使用ThreadLocal创建的变量只能被当前线程访问，其他线程则无法访问和修改。

[参考](https://droidyue.com/blog/2016/03/13/learning-threadlocal-in-java/)

## FutureTask 
FutureTask一个可取消的异步计算，FutureTask 实现了Future的基本方法，

提空 start cancel 操作，可以查询计算是否已经完成，并且可以获取计算的结果。

结果只可以在计算完成之后获取，get方法会阻塞当计算没有完成的时候，一旦计算已经完成，那么计算就不能再次启动或是取消。

[用法](https://blog.csdn.net/chenliguan/article/details/54345993)

##  interrupted() and isInterrupted()

interrupted是一个静态方法，检查当前线程是否中断

isInterrupted是非静态方法，检查该线程是否中断

## Thread类的join方法作用
等待线程完成

在某些情况下，我们将不得不等待线程的完成。

例如，我们可能有一个程序，它将在执行其余执行之前开始初始化所需的资源。

我们可以将初始化任务作为线程运行，并等待其完成，然后再继续执行程序的其余部分。

为此，我们可以使用Thread类的join（）方法。当我们使用线程对象调用此方法时，它会暂停调用线程的执行，直到被调用的对象完成其执行为止。

[参考](https://www.cnblogs.com/duanxz/p/5038471.html)


## wait 和 sleep的区别
尽管wait和sleep都在Java应用程序中引入了某种形式的暂停，但它们是满足不同需求的工具。
Wait方法用于线程间通信，它在等待条件为true时放弃锁定，并在由于另一个线程等待条件的操作变为false时等待通知。
另一方面，sleep（）方法只是放弃CPU或在指定的持续时间内停止当前线程的执行。调用sleep方法不会释放当前线程持有的锁。

## What is thread pool? Why should you use thread pool in Java?
就时间和资源而言，创建线程是昂贵的。

如果在请求处理时创建线程，这会减慢响应时间，而且进程只能创建数量有限的线程。

为了避免这两个问题，在应用程序启动时将创建一个线程池，并将线程重新用于请求处理。该线程池称为“线程池”，而线程称为工作线程

通过 Executor framwork 实现

Executors.newCachedThreadPool()：无限线程池。

Executors.newFixedThreadPool(nThreads)：创建固定大小的线程池。

Executors.newSingleThreadExecutor()：创建单个线程的线程池。

## How do you avoid deadlock in Java? Write Code?
最简单的办法是避免循环等待 Circular Wait

## synchronized vs Lock

synchronized是一个keyword, 在C#中关键字是lock

Lock是一个接口，实现它的类有 ReentrantLock

[Answer](https://stackoverflow.com/questions/4201713/synchronization-vs-lock)

ReentrantLock 锁是非结构化的，lock和unlock可以在不同的方法里调用

## How do you check if a Thread holds a lock or not? 
Thread类有一个holdsLock(), 当且仅当当前线程hold住设定的对象时，返回true

## 如何保证线程顺序执行？

用join

## Thread的yield()作用
Yield方法是请求当前线程放弃CPU以便其他线程可以执行的一种方法。
Yield是一种静态方法，仅保证当前线程将放弃CPU，但不指明任何其他线程将获得CPU。

## 在ConcurrentHashMap中concurrency level是什么作用，如何设置？
concurrency level which is used as a hint for internal sizing.

## Semaphore 是什么

Semaphore 字面意思是信号量的意思，它的作用是控制访问特定资源的线程数目。

方法 acquire获取线程，release释放线程

[参考](https://www.jianshu.com/p/38630b7dbe73)

## Mutex vs Semaphore
Semaphore can be counted, while mutex can only count to 1.

[参考](https://stackoverflow.com/questions/771347/what-is-mutex-and-semaphore-in-java-what-is-the-main-difference)

JDK中没有专门的Mutex类，不过有很多种方法实现mutex

例如关键字synchronized，或者用Semaphore，设置信号量为1

[例子](https://mkyong.com/java/java-thread-mutex-and-semaphore-example/)

## Execute() 和 submit()方法的区别
两种方法都是将任务提交到线程池的方法，但是它们之间略有不同。
execute（Runnable command）在Executor接口中定义，将来会执行给定任务，但更重要的是，它不返回任何内容。其返回类型为void。

另一方面，submit（）是重载的方法，它可以使用Runnable或可调用任务，并且可以返回可以保存未决计算结果的Future对象。

此方法在ExecutorService接口上定义，该接口扩展了Executor接口，并且其他所有线程池类（

例如ThreadPoolExecutor或ScheduledThreadPoolExecutor）都将获得这些方法。

## What is blocking method in Java?
blocking method是一种阻塞方法，直到任务完成为止，例如ServerSocket的accept()方法阻塞，直到连接了客户端。

此处的阻塞表示在任务完成之前，控制权不会返回给调用者。

另一方面，有一种异步或非阻塞方法，该方法甚至在任务完成之前就返回。


## How to create an Immutable object in Java
什么叫不可变对象，不可变对象意味着创建后就不能更改该对象，例如String对象

可以将field定义成final以阻止任何更改，并且去掉set方法

对于Date类变量，则返回其clone

## What is ReadWriteLock in Java

读写锁定是为了提高并发应用程序性能而采用的锁定剥离技术的结果。

在Java中，ReadWriteLock 是在Java 5版本中添加的接口。

一个 ReadWriteLock中维护一对相关的锁，一个用于只读操作，另一个用于写入的。

只要没有写程序，读锁就可以同时由多个读程序线程保持。写锁是排他的。

See Start Demo 17

## What is busy spin in multi-threading?
Busy spin是并发程序员用来使线程在特定条件下等待的技术。

与传统方法（例如，wait（），sleep（）或yield（））都涉及放弃CPU控制的方法不同，该方法不会放弃CPU，而只会运行空循环。

为什么有人这样做？保留CPU缓存。在多核系统中，暂停的线程有可能在其他核上恢复，这意味着需要重新构建缓存。

为了避免重建缓存的成本，程序员更喜欢等待更短的时间进行Busy spin。


## Java中的volatile和atomic变量有什么区别？
这对于Java程序员来说是一个有趣的问题，首先，volatile和atomic变量看起来非常相似，但是它们是不同的。

volatile为您提供了发生条件-在保证写操作在任何后续写操作之前发生之前，它不能保证原子性。

例如，仅通过将count变量声明为volatile，count ++操作就不会成为原子操作。

另一方面，AtomicInteger类提供了原子方法来原子地执行此类复合操作，例如getAndIncrement（）是增量运算符的原子替换。

它可以用于原子地将当前值加1。同样，对于其他数据类型和引用变量，您也具有原子版本。

## 什么是单例的双重检查锁定？
这实际上是创建线程安全的单例的一种旧方法，该方法尝试仅在首次创建Singleton实例时才通过锁定来优化性能，

```
 private volatile static Singleton uniqueSingleton;
 public Singleton getInstance() {
        if (null == uniqueSingleton) {
            synchronized (Singleton.class) {
                if (null == uniqueSingleton) {
                    uniqueSingleton = new Singleton();   // error
                }
            }
        }
        return uniqueSingleton;
 }
```
双重检查，第一检查单例实例是否为空，第二如果为空，加synchronized block, 进行初始化。并且声明该对象为volatile

[双重检查锁定](https://www.cnblogs.com/xz816111/p/8470048.html)

## 列出您遵循的3种多线程最佳实践？
**始终为您的线程取一个有意义的名称**

这在查找错误或跟踪并发代码中的执行方面大有帮助。
OrderProcessor，QuoteProcessor或TradeProcessor比Thread-1好得多。线程2和线程3。名称应说明该线程完成的任务。所有主要框架，甚至JDK都遵循此最佳实践。
**避免锁定或缩小同步范围**

锁定的成本很高，上下文切换的成本甚至更高。尽量避免同步和锁定，并且应至少减少关键部分。

这就是为什么我更喜欢同步块而不是同步方法的原因，因为它可以让您对锁定范围进行绝对控制。

Prefer Synchronizers over wait and notify

CountDownLatch，Semaphore，CyclicBarrier或Exchanger之类的同步器可简化编码。

使用wait和notify来实现复杂的控制流程非常困难。

其次，这些类是由最佳业务人员编写和维护的，并且很有可能在后续的JDK版本中对它们进行优化或替换为性能更好的代码。

通过使用更高级别的同步实用程序，您将自动获得所有这些好处。

**Prefer Concurrent Collection over Synchronized Collection**

这是另一种简单的最佳实践，易于遵循，但可带来很多好处。并发集合比同步的集合更具可伸缩性，

这就是为什么在编写并发代码时最好使用它们。因此，下次如果您需要Map，请在考虑Hashtable之前考虑ConcurrentHashMap。

## How do you force to start a Thread in Java?
不能保证按照指定顺序启动线程
