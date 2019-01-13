package com.naya.springpatterns.aop_patterns;

import com.naya.springpatterns.aop_patterns.dao.Dao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
    private final Dao dao;

    @Override
    public void doWork() {
        System.out.println("Working...");
        dao.save();
    }
}
