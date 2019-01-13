package com.naya.springpatterns.chain_of_responsibility;

import com.naya.chain_of_responsibilities.DataObject;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface DataValidator {
    String findViolation(DataObject o);
}
