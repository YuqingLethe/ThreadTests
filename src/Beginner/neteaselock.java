package Beginner;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class neteaselock  implements Lock {
    @Override
    public void lock() {

    }
    @Override
    public  boolean tryLock() {
        return true;
    }
    public void unlock() {

    }


    public void lockInterruptibly() throws InterruptedException {

    }


    public boolean tryLock (long time, TimeUnit unit) {
        return false;
    }


    public Condition newCondition() {

        return null;
    }
}
