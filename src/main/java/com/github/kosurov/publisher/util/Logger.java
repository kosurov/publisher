package com.github.kosurov.publisher.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private int logNumber = 1;

    private static Logger logger;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {

        System.out.println("[" + logNumber++ + " " + LocalDateTime.now().format(formatter) + "] " + msg);
    }
}
