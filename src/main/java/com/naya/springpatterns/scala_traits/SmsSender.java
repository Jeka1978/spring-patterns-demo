package com.naya.springpatterns.scala_traits;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sending by sms");
    }
}
