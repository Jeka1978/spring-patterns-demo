package com.naya.strategy_command;

import org.springframework.stereotype.Service;

import static com.naya.strategy_command.DeliveryType.WHATS_APP;

/**
 * @author Evgeny Borisov
 */
@Service(DeliveryType.WHATS_APP)
public class WhatsAppSender implements MessageSender {
    @Override
    public String send(Message message) {
        String status = "WhatsApp msg was sent";
        System.out.println(status);
        return status;
    }

    @Override
    public String myCode() {
        return WHATS_APP;
    }

}
