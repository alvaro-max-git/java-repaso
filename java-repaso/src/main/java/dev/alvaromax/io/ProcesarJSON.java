package dev.alvaromax.io;

import java.io.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ProcesarJSON {

    public static void leerJSON (File jsonFile) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List <Persona> personas = mapper.readValue(jsonFile, new TypeReference<List<Persona>>() {});

        for(Persona p : personas) {
            System.out.println(p.nombre + " " + p.apellido + " " + " - Email: " + p.email);
        }

    }

    public static void main (String [] args) {
        File jsonFile = new File("./java-repaso/src/main/resources/sampledata.json");

        try {
            leerJSON(jsonFile);
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
