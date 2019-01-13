package com.naya.strategy_command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Message {
    private String distributionType;
    private String content;
    private String to;
}
