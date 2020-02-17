package Beginner;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class neteaselock  implements Lock {
    @Override
    public void lock() {

    }

    public void lockInterruptibly() throws InterruptedException {

    }
    @Override
    public  boolean tryLock() {
        return true;
    }

    public boolean tryLock (long time, TimeUnit unit) {
        return false;
    }

    public void unlock() {

    }

    public Condition newCondition() {

        return null;
    }
}
