package com.naya.strategy_command;

/**
 * @author Evgeny Borisov
 */
public class TelegramSender implements MessageSender {
    @Override
    public String send(Message message) {
        return "TELEGRAM SENT";
    }

    @Override
    public String myCode() {
        return "003";
    }
}
