package com.github.kosurov.publisher.services;

import com.github.kosurov.publisher.models.Message;
import com.github.kosurov.publisher.util.Logger;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MessageService {

    public Message generateRandomMessage() {
        Logger logger = Logger.getInstance();
        Message message = new Message(generateRandomMsisdn(),
                generateRandomAction(),
                System.currentTimeMillis());
        logger.log("Message sent: " + message);
        return message;
    }

    private int generateRandomMsisdn() {
        // В качестве номера абонента генерируется целое число в диапазоне от 100000000 до 199999999
        Random random = new Random();
        return random.nextInt(100_000_000) + 100_000_000;
    }

    private String generateRandomAction() {
        Random random = new Random();
        int actionDeterminant = random.nextInt(2);
        if (actionDeterminant == 0) {
            return "PURCHASE";
        } else {
            return "SUBSCRIPTION";
        }
    }
}
