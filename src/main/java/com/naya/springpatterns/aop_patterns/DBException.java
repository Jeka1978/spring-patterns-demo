package com.naya.springpatterns.aop_patterns;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
