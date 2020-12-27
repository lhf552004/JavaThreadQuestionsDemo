package myProject;

import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    @SuppressWarnings("static-access")
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //------------------------------------------------------------
        //Demo 1 for CountDownLatch
        //  Let us create task that is going to
        //  wait for four threads before it starts
        //		CountDownLatch latch = new CountDownLatch(4);
        //
        //		// Let us create four worker
        //		// threads and start them.
        //		Worker first = new Worker(1000, latch,
        //				"WORKER-1");
        //		Worker second = new Worker(1000, latch,
        //				"WORKER-2");
        //		Worker third = new Worker(1000, latch,
        //				"WORKER-3");
        //		Worker fourth = new Worker(1000, latch,
        //				"WORKER-4");
        //		first.start();
        //		second.start();
        //		third.start();
        //		fourth.start();
        //
        //
        //		// The main task waits for four threads
        //		latch.await();
        //
        //		// Main thread has started
        //		System.out.println(Thread.currentThread().getName() +
        //				" has finished");
        //Demo 1 for CountDownLatch ends
        //--------------------------------------------

        // Demo 2 for CyclicBarrier
        //		Runnable barrier1Action = new Runnable() {
        //			public void run() {
        //				System.out.println("BarrierAction 1 executed ");
        //			}
        //		};
        //		Runnable barrier2Action = new Runnable() {
        //			public void run() {
        //				System.out.println("BarrierAction 2 executed ");
        //			}
        //		};
        //
        //		CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
        //		CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);
        //
        //		CyclicBarrierRunnable barrierRunnable1 =
        //				new CyclicBarrierRunnable(barrier1, barrier2);
        //
        //		CyclicBarrierRunnable barrierRunnable2 =
        //				new CyclicBarrierRunnable(barrier1, barrier2);
        //
        //		new Thread(barrierRunnable1).start();
        //		new Thread(barrierRunnable2).start();
        // Demo2 ends
        //--------------------------------------------------------
        //Demo 3 Sort---------------------------------------------
        //		List<Student> list = Arrays.asList(new Student("Hallun", 33), new Student("Alex", 23), new Student("Yelk", 33));
        //
        //		System.out.println("Unsorted List in Java: " + list);
        //		list.sort(new Comparator<Student>() {
        //			@Override
        //			public int compare(Student h1, Student h2) {
        //				return h1.getName().compareTo(h2.getName());
        //			}
        //		});
        //		System.out.println("Sorted List in Java: " + list);
        //		List<Student> list2 = Arrays.asList( new Student("Hallun", 33), new Student("Alex", 23), new Student("Yelk", 33));
        //
        //		Collections.sort(list2, new Comparator<Student>() {
        //			@Override
        //			public int compare(Student h1, Student h2) {
        //				return h1.getName().compareTo(h2.getName());
        //			}
        //		});
        //		System.out.println("Sorted List by Collections.sort: " + list2 );
        //demo3 ends

        // Demo4-------------------------------------------------------
        // Show NavigableMap automatically sort and descendingKeySet, floorEntry
        //		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

        // Add elements using put() method
        //		nm.put("C", 888);
        //		nm.put("Y", 999);
        //		nm.put("A", 444);
        //		nm.put("T", 555);
        //		nm.put("B", 666);
        //		nm.put("A", 555);
        //
        //		// Print the contents on the console
        //		System.out.println("Mappings of NavigableMap : "
        //				+ nm);
        //
        //		System.out.printf("Descending Set  : %s%n",
        //				nm.descendingKeySet());
        //		System.out.printf("Floor Entry  : %s%n",
        //				nm.floorEntry("L"));
        //		System.out.printf("First Entry  : %s%n",
        //				nm.firstEntry());
        //		System.out.printf("Last Key : %s%n", nm.lastKey());
        //		System.out.printf("First Key : %s%n",
        //				nm.firstKey());
        //		System.out.printf("Original Map : %s%n", nm);
        //		System.out.printf("Reverse Map : %s%n",
        //				nm.descendingMap());
        // end Demo4----------------------------------

        // Demo 5 starts-------------------------------
        // linkedlist with listIterator to show add item
        //		List<String> staff = new LinkedList<>();
        //		staff.add("zhuwei");
        //		staff.add("xuezhangbin");
        //		staff.add("taozhiwei");
        //		ListIterator<String> iter = staff.listIterator();
        //		while(iter.hasNext()) {
        //			String curr = iter.next();
        //			if(curr.contains("zhang")) {
        //				iter.add("Zhang bin");
        //			}
        //			System.out.println(curr);
        //		}
        //		System.out.println(staff);
        // end Demo5-----------------------------------

        // Demo 6 starts------------------------------
        // Thread class and Runnable

        //				Runnable task2 = () -> { System.out.println(Thread.currentThread().getName() + " is running"); };
        //
        //
        //				new Thread(new Empty()).start();
        //				// start the thread
        //				new Thread(task2).start();
        //				new Thread(task2).start();
        //				new Thread(task2).start();

        // Demo 6 ends----------------------------------

        // Start Demo 7 volatile-----------------------------
//		MyThread myThread = new MyThread();
//		myThread.start();
//		myThread.number = 42;
//		myThread.ready = true;
//		new MyThread().start();
//		new MyThread().start();
        // end demo 7-----------------------------------

        // Demo 8 BlockQueue-----------------------------
//		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
//
//		Producer producer = new Producer(queue);
//		Consumer consumer = new Consumer(queue);
//
//		new Thread(producer).start();
//		new Thread(consumer).start();
//
//		Thread.sleep(4000);

        // End Demo 8-----------------------------------

        // Starts Demo 9 notifyAll----------------------
//		 var q = new TaskQueue();
//	        var ts = new ArrayList<Thread>();
//	        for (int i=0; i<5; i++) {
//	            var t = new Thread() {
//	                public void run() {
//	                    // 执行task:
//	                    while (true) {
//	                    	try {
//	                            String s = q.getTask();
//	                            System.out.println("execute task: " + s);
//	                        } catch (InterruptedException e) {
//	                            return;
//	                        }
//	                    }
//	                }
//	            };
//	            t.start();
//	            ts.add(t);
//	        }
//	        var add = new Thread(() -> {
//	            for (int i=0; i<10; i++) {
//	                // 放入task:
//	                String s = "t-" + Math.random();
//	                System.out.println("add task: " + s);
//	                q.addTask(s);
//	                try { Thread.sleep(100); } catch(InterruptedException e) {}
//	            }
//	        });
//	        add.start();
//	        add.join();
//	        Thread.sleep(100);
//	        for (var t : ts) {
//	            t.interrupt();
//	        }
        // Ends Demo 9----------------------------------

        // Start Demo 10 FutureTask--------------------------------
//	        Task task = new Task();// 新建异步任务
//			FutureTask<Integer> future = new FutureTask<Integer>(task) {
//				// 异步任务执行完成，回调
//				@Override
//				protected void done() {
//					try {
//						System.out.println("future.done():" + get());
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					} catch (ExecutionException e) {
//						e.printStackTrace();
//					}
//				}
//			};
//			// 创建线程池（使用了预定义的配置）
//			ExecutorService executor = Executors.newCachedThreadPool();
//			executor.execute(future);
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//			}
//			// 可以取消异步任务
//			// future.cancel(true);
//
//			try {
//				// 阻塞，等待异步任务执行完毕-获取异步任务的返回值
//				System.out.println("future.get():" + future.get());
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				e.printStackTrace();
//			}

        // End Demo 10 ---------------------------------------------

        // Start Demo 11 Mutual Exclusion---------------------------
//		DeadLockDemo demo = new DeadLockDemo();
//		Runnable task1 = () -> { demo.method1(); };
//		Runnable task2 = () -> { demo.method1(); };
//		Thread thread1 = new Thread(task1);
//		Thread thread2 = new Thread(task2);
//		thread1.start();
//		thread2.start();

        // End Demo 11----------------------------------------------
        // Start Demo 12 ReentrantLock----------------------------------------
//		ReentrantLock lock = new ReentrantLock();
//		ReentrantLock rel = new ReentrantLock();
//	    ExecutorService pool = Executors.newFixedThreadPool(2);
//	    Runnable w1 = new Worker2(rel, "Job1");
//	    Runnable w2 = new Worker2(rel, "Job2");
//	    Runnable w3 = new Worker2(rel, "Job3");
//	    Runnable w4 = new Worker2(rel, "Job4");
//	    pool.execute(w1);
//	    pool.execute(w2);
//	    pool.execute(w3);
//	    pool.execute(w4);
//	    pool.shutdown();
        // End Demo 12 ---------------------------------------------

        // Start Demo 13 to show ConcureentHashMap-------------------------------------------
//		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
//
//		// Insert mappings using
//		// put method
//		m.put(100, "Hello");
//		m.put(101, "Geeks");
//		m.put(102, "Geeks");
//		System.out.println(m);
//		// Here we cant add Hello because 101 key
//		// is already present in ConcurrentHashMap object
//		m.putIfAbsent(101, "Hello");
//		System.out.println(m);
//		// We can remove entry because 101 key
//		// is associated with For value
//		m.remove(101, "Geeks");
//		m.
//		// Now we can add Hello
//		m.putIfAbsent(103, "Hello");
//
//		// We cant replace Hello with For
//		m.replace(101, "Hello", "For");
//		System.out.println(m);
        // End Demo 13---------------------------------------------

        // Start Demo 14 Semaphore----------------------------------
//		int threadNum = 5;
//        Semaphore semaphore = new Semaphore(2);
//        for (int i = 0; i < threadNum; i++) {
//            new TaskThread(semaphore).start();
//        }
        // End Demo 14---------------------------------------------
        // Start Demo 15 executor submit-----------------------------------------
//		ExecutorService executor = Executors.newCachedThreadPool();
////		executor.execute(future);
//		Callable task = () -> { System.out.println("Callable called"); return 1; };
//		Future obj = executor.submit(task);
//		System.out.println(obj.get());
        // End Demo 15--------------------------------------------

        // Start Demo 16--Immutable----------------------------------------
//		Contacts contracts = new Contacts("Alex", "123456");
//		contracts = new Contacts("Allen", "123456");
        // End Demo 16-----------------------------------------------------

        // Start Demo 17 ReentrantReadWriteLock---------------------------------------------
        ExecutorService executor = Executors.newCachedThreadPool();
        ThreadSafeArrayList<String> threadSafeArrayList = new ThreadSafeArrayList<>();
        Runnable task1 = () -> {threadSafeArrayList.set("1"); };
        Runnable task2 = () -> {threadSafeArrayList.set("2"); };
        Runnable task3 = () -> {threadSafeArrayList.set("3"); };
        Runnable task4 = () -> {
            if(threadSafeArrayList.getLength() > 0)
                System.out.println("Printing the First Element : "+threadSafeArrayList.get(0));
        };
        Runnable task5 = () -> {
            if(threadSafeArrayList.getLength() > 1)
                System.out.println("Printing the Second Element : "+threadSafeArrayList.get(1));
        };
        Runnable task6 = () -> {
            if(threadSafeArrayList.getLength() > 2)
                System.out.println("Printing the Third Element : "+threadSafeArrayList.get(2));
        };
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
        executor.execute(task5);
        executor.execute(task6);
        // End Demo 17-------------------------------------------------------



        //		Deque<String> d2 = new LinkedList<>();
        //		d2.add("My first");
        //		d2.addFirst("Add at first");
        //		d2.offerLast("z");
        //		 System.out.println(d2);
        //		LinkedList<String> linkedList = new LinkedList<>();
        //
        //        linkedList.add("first");
        //        linkedList.add("second");
        //        linkedList.add("third");
        //        System.out.println(linkedList);
        //
        //        linkedList.addFirst("addFirst");
        //        System.out.println(linkedList);
        //
        //        linkedList.addLast("addLast");
        //        System.out.println(linkedList);
        //
        //        linkedList.add(2, "addByIndex");
        //        System.out.println(linkedList);
        //		HashSet<String> hashSet = new HashSet<String>();
        //		hashSet.add("Jack");
        //		hashSet.add("Mory");
        //		HashMap<Integer, String> stockMap=new HashMap<Integer,String>();
        //		Map<Integer, String> map = Collections.synchronizedMap(stockMap);
        //Hashtable instance used for Iterator Example in Java
        //        Hashtable<Integer, String> stockTable=new Hashtable<Integer,String>();
        //
        //        //Populating Hashtable instance with sample values
        //        stockTable.put(new Integer(1), "Two");
        //        stockTable.put(new Integer(2), "One");
        //        stockTable.put(new Integer(4), "Four");
        //        stockTable.put(new Integer(3), "Three");
        //
        //        //Getting Set of keys for Iteration
        //        Set<Entry<Integer, String>> stockSet = stockTable.entrySet();
        //
        //        HashMap<Integer, String> stockMap=new HashMap<Integer,String>();
        //        stockMap.entrySet();
        //        // Using Iterator to loop Map in Java, here Map implementation is Hashtable
        //        Iterator<Entry<Integer, String>> i= stockSet.iterator();
        //        System.out.println("Iterating over Hashtable in Java");
        //
        //        //Iterator begins
        //        while(i.hasNext()){
        //            Map.Entry<Integer,String> m=i.next();
        //            int key = m.getKey();
        //            String value=m.getValue();
        //            System.out.println("Key :"+key+"  value :"+value);
        //
        //        }
        //        System.out.println("Iteration over Hashtable finished");


        //		int[] array = {1, 2, 3, 4, 5};
        //		ChangeIt.doIt(array);
        //		for(int i = 0; i< array.length; i++) {
        //			System.out.println(array[i] +" ");
        //		}
        //
        //		PriorityQueue<String> queue=new PriorityQueue<String>();
        //		queue.add("Amit");
        //		queue.add("Vijay");
        //		queue.add("Karan");
        //		queue.add("Jai");
        //		queue.add("Rahul");
        //		System.out.println("head:"+queue.element());
        //		System.out.println("head:"+queue.peek());
        //		System.out.println("iterating the queue elements:");
        //		queue.offer("aaa");
        //
        //		Iterator<String> itr = queue.iterator();
        //		while(itr.hasNext()){
        //			System.out.println(itr.next());
        ////			itr.remove();
        //		}
        //		queue.remove();
        //		System.out.println("Poll: " + queue.poll());
        //		System.out.println("after removing two elements:");
        //		Iterator<String> itr2=queue.iterator();
        //		while(itr2.hasNext()){
        //			System.out.println(queue.poll());
        //		}
        //
        //		System.out.println("Peek: " + queue.peek());
        // It will invoke an error
        //		System.out.println("Element: " + queue.element());

    }

    public void name() {
        System.out.println(this);
    }

}
