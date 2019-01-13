package com.naya.lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
public class LazySingleton {
    @PostConstruct
    private void init(){
        System.out.println("две минуты прошло и вот я родился");
    }

    public void doPlanB() {
        System.out.println("Plan B is working...");
    }

}
