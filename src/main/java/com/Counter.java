package com;

import com.annotion.ThreadSafe;

/**
 * 安全并且不可继承的类
 */
@ThreadSafe
public final class Counter {
    private long value = 0;

    public synchronized long getValue() {
        return value;
    }

    public synchronized long increment() {
        if (value == Long.MAX_VALUE) {
            throw new IllegalStateException("counter overflow");
        }
        return ++value;
    }
}
