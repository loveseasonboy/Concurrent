package com;

import com.annotion.NotThreadSafe;

/**
 * 线程不安全的例子
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value = 0;

//    public synchronized int getNext() {
//        System.err.println(Thread.currentThread().getName());
//        return ++value;
//    }
    public int getNext() {
        System.err.println(Thread.currentThread().getName());
        return ++value;
    }
}
