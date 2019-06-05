package org.oursight.learning.guava.event;

/**
 * Created by yaonengjun on 2019/6/5 下午4:53.
 */
public class EventEntity {

    private final int message;

    public EventEntity(int m) {
        this.message = m;

        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
        System.out.println("message created:" + message);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getMessage() {
        return message;
    }
}
