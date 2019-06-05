package org.oursight.learning.guava.event;

import com.google.common.eventbus.Subscribe;

/**
 * Created by yaonengjun on 2019/6/5 下午4:55.
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(EventEntity event) {
        lastMessage = event.getMessage();
        System.out.println("Message received:"+lastMessage);
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
