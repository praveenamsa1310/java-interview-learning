package org.java.javaclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateAndTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Current Year : " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Formated Date : " + formatter.format(localDateTime));

        String inputDate = "2026-01-01";

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(inputDate, inputFormatter);

        System.out.println("Input Date : " + localDate);
    }
}
