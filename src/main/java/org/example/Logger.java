package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {
    protected int num = 1;
    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    void log(String msg) {
        System.out.println("[ " + formatForDateNow.format(date) + " " + num++ + "] " + msg);
    }
}
