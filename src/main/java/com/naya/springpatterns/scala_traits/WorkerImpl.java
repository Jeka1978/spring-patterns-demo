package com.naya.springpatterns.scala_traits;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WorkerImpl implements Worker {
    @Override
    public void doWork() {
        System.out.println("Work 1111111111");
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("com.naya.springpatterns");
    }
}
