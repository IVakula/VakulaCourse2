package homework19.task1;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeList<T> {
    private final List<T> list;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public ThreadSafeList(List<T> list) {
        this.list = list;
    }

    public void add(T element) {
        try {
            lock.writeLock().lock();
            list.add(element);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void remove(int index) {
        try {
            lock.writeLock().lock();
            list.remove(index);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public T get(int index) {
        try {
            lock.readLock().lock();
            return list.get(index);
        } finally {
            lock.readLock().unlock();
        }
    }
}
