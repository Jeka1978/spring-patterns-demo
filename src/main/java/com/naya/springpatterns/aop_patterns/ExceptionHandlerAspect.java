package com.naya.springpatterns.aop_patterns;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    private Map<DBException, Void> cache = new WeakHashMap<>();

    @Pointcut("execution(* com.naya.springpatterns.aop_patterns.*.*(..))")
    public void allMethods(){}

    @AfterThrowing(pointcut = "allMethods()",throwing = "ex")
    public void handleException(DBException ex) {
        WeakReference<Exception> weakReference = new WeakReference<Exception>(new RuntimeException());

        if (!cache.containsKey(ex)) {
            System.out.println("mail was sent "+ex.getMessage());
            cache.put(ex, null);
        }
    }

}
