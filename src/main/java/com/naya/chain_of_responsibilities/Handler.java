package com.naya.chain_of_responsibilities;

/**
 * @author Evgeny Borisov
 */
public interface Handler {
    void handle(DataObject t);
}
