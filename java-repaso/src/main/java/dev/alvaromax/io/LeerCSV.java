package dev.alvaromax.io;

import org.apache.commons.csv.*;
import java.io.*;

public class LeerCSV {

    public static void main (String [] args) {

    String filepath = "./java-repaso/src/main/resources/sampledata.csv";

    try (FileReader reader = new FileReader (filepath)) {

        Iterable<CSVRecord> records = CSVFormat.EXCEL.builder().setHeader("Nombre","Apellido","Edad", "DNI", "Email").get().parse(reader);

        //Iterable <CSVRecord> records = CSVFormat.RFC4180.builder().setHeader().setSkipHeaderRecord(true).build().parse(reader);

        for (CSVRecord record : records) {
            String firstName = record.get("Nombre");
            String lastName = record.get("Apellido");
            String edad = record.get ("Edad");
            String dni = record.get("DNI");
            String email = record.get("Email");

            System.out.println(firstName + " " + lastName + " Edad: " + edad + " DNI: " + dni + " email: " + email);

        }

    } catch (IOException e) {
        System.out.println(e);
    }

    }


}
