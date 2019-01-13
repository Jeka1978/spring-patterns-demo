package com.naya.strategy_command;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static com.naya.strategy_command.DeliveryType.SMS;

/**
 * @author Evgeny Borisov
 */
@Service(SMS)
public class SmsSender implements MessageSender {


    @Override
    public String send(Message message) {
        String status = "Sms msg was sent ";
        System.out.println(status);
        return status;
    }

    @Override
    public String myCode() {
        return SMS;

    }

}
