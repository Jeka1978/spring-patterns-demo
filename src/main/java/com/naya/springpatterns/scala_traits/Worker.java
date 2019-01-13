package com.naya.springpatterns.scala_traits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public interface Worker {
    @EventListener(ContextRefreshedEvent.class)
    default void work(){
        doWork();
    }

    @Autowired
    default void sendNotification(Sender sender) {
        sender.send();
    }

    void doWork();
}
