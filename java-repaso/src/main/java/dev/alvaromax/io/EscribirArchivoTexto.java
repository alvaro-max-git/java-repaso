package dev.alvaromax.io;

import java.io.*;

public class EscribirArchivoTexto {
    
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Línea uno para escribir\n");
        sb.append("Línea dos para escribir\n");
        sb.append("Línea 3\n");

        String pathname = "./java-repaso/src/main/java/dev/alvaromax/io/text_output.txt";

        try (FileWriter fw = new FileWriter(new File(pathname))) {
            fw.write(sb.toString());
        } catch (IOException exc) {
            System.out.println(exc);
        }

    }
}
