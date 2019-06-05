package org.oursight.learning.guava.event;

import com.google.common.eventbus.EventBus;

/**
 * Created by yaonengjun on 2019/6/5 下午4:56.
 */
public class EventMain {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();

        eventBus.register(listener);

        eventBus.post(new EventEntity(200));
        eventBus.post(new EventEntity(300));
        eventBus.post(new EventEntity(400));

        System.out.println("LastMessage:"+listener.getLastMessage());
        ;
    }
}
