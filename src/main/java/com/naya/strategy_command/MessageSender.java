package com.naya.strategy_command;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MessageSender {
    String send(Message message);
    String myCode();

    @Autowired
    default void register(MessageDistributor messageDistributor) {
        messageDistributor.register(myCode(), this);
    }



}
