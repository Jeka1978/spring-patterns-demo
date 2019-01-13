package com.naya.strategy_command;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.data.util.Pair.toMap;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class MessageDistributor {


    private Map<String,MessageSender> map = new HashMap<>();

    @PostMapping("/send")
    public String distribute(@RequestBody Message message) {
        String type = message.getDistributionType();
        MessageSender sender = map.get(type);
        if (sender == null) {
            return "not supported " + type;
        }
        return sender.send(message);


    }


    public void register(String myCode, MessageSender messageSender) {
        map.put(myCode, messageSender);
    }
}
