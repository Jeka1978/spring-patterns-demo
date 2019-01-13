package com.naya.chain_of_responsibilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainHandler {
    @Autowired
    private List<Handler> handlers;




    public void handle(DataObject t) {
       handlers.forEach(handler -> handler.handle(t));
    }













    private void handle3(DataObject t) {

    }

    private void handle2(DataObject t) {
    }

    private void handle1(DataObject t) {
    }
}
