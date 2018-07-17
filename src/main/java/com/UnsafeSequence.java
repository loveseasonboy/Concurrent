package com;

import com.annotion.NotThreadSafe;

/**
 * 线程不安全的例子
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value = 0;

    public int getNext() {
        return value++;
    }
}
