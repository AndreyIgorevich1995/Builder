package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    @Test
    void log() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        Logger logger = Logger.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        int num = 1;
        String msg = "Hello";
        stringBuilder.append("[ " + formatForDateNow.format(date) + " " + num++ + "] " + msg + "\n");
//        String consoleOutput = logger.log("Hello");


        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(1000);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            logger.log("Hello");
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(stringBuilder, consoleOutput);
    }
}