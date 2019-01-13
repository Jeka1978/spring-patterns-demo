package com.naya.springpatterns.aop_patterns.dao;

import com.naya.springpatterns.aop_patterns.DBException;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving...");
        throw new DBException("Problem..");
    }
}
