package myProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeArrayList<E>
{
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final Lock readLock = readWriteLock.readLock();

    private final Lock writeLock = readWriteLock.writeLock();

    private final List<E> list = new ArrayList<>();

    public void set(E o)
    {
        writeLock.lock();
        try
        {
            list.add(o);
            System.out.println("Adding element by thread"+Thread.currentThread().getName());
        }
        finally
        {
            writeLock.unlock();
            System.out.println("Unlock write lock by thread"+Thread.currentThread().getName());
        }
    }

    public int getLength() {
        readLock.lock();
        int size = list.size();
        readLock.unlock();
        return size;
    }

    public E get(int i)
    {
        readLock.lock();
        try
        {
            System.out.println("Printing elements by thread"+Thread.currentThread().getName());
            return list.get(i);
        }
        finally
        {
            readLock.unlock();
        }
    }
}