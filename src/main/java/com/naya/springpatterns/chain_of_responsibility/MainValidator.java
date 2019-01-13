package com.naya.springpatterns.chain_of_responsibility;

import com.naya.chain_of_responsibilities.DataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainValidator {
    @Autowired
    private List<DataValidator> validators;

    public void printViolations(DataObject o) {
        StringBuilder sb = new StringBuilder();
        for (DataValidator validator : validators) {
            String violationMessage = validator.findViolation(o);
            if (violationMessage != null) {
                sb.append(violationMessage).append("\n");
            }
        }
        String finalMessage = sb.toString();
        if (!finalMessage.isBlank()) {
            System.out.println(finalMessage);
        }else {
            System.out.println("no violations");
        }
    }
}
