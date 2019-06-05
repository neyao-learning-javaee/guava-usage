package org.oursight.learning.guava.event;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

/**
 * Created by yaonengjun on 2019/6/5 下午4:55.
 */
public class EventListener {

    public int lastMessage = 0;

    @AllowConcurrentEvents
    @Subscribe
    public void listen(EventEntity event) {
        lastMessage = event.getMessage();
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
        System.out.println("Message received:"+lastMessage);

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
