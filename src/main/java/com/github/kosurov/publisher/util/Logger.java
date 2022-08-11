package com.github.kosurov.publisher.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

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
        // Создаем новый файл log.txt, если он отсуствует
        File log = new File("log.txt");
        try {
            if (!log.exists()) {
                log.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Записываем в файл log.txt
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(log, true))) {
            String str = "[" + LocalDateTime.now().format(formatter) + "] " + msg + "\n";
            bufferedWriter.write(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
