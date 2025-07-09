package dev.alvaromax.io;

import java.io.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ProcesarJSON {

    public static void leerJSON (File jsonFile) throws Exception {


        ObjectMapper mapper = new ObjectMapper();
                
        //Podemos leer un JSON con JsonNode
        JsonNode jsonNode = mapper.readTree(jsonFile);
        JsonNode node = jsonNode.get(0).get("Nombre");
        System.out.println(node);

        //O extraer una estructura de datos como un List<POJO> e iterar
        List <Persona> personas = mapper.readValue(jsonFile, new TypeReference<List<Persona>>() {});
        for(Persona p : personas) {
            System.out.println(p.nombre + " " + p.apellido + " " + " - Email: " + p.email);
        }
        
        //filtrado con streams:
        personas.stream()
            .filter(p -> p.edad > 30)
            .map(p -> p.email)
            .forEach(System.out::println);
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
