package org.oursight.learning.guava.event;

/**
 * Created by yaonengjun on 2019/6/5 下午4:53.
 */
public class EventEntity {

    private final int message;

    public EventEntity(int m) {
        this.message = m;
        System.out.println("message created:" + message);
    }

    public int getMessage() {
        return message;
    }
}
