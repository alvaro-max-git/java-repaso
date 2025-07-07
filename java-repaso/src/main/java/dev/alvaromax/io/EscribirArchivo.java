package dev.alvaromax.io;

import java.io.*;



public class EscribirArchivo {


    // Escribimos caracteres ASCII (podría ser cualquier blob de bytes) en un archivo.
    public static void escribirOutputStream (File outputfile) {
        try(OutputStream fos = new FileOutputStream(outputfile)) {
            for (int i = 0x30; i <= 0x39; i++) {
                fos.write(i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Escribimos una string en un archivo con FileWriter
    public static void escribirFileWriter (File outputfile) {
        try (FileWriter writer = new FileWriter(outputfile)) {
            writer.write ("Hola mundo \nEsto es un archivo de salida escrito por Álvaro \n");
            writer.append("Otra cadena de texto \n");
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }


    public static void main(String[] args) {

        File fos_out = new File ("./java-repaso/src/main/java/dev/alvaromax/io/fos_output.txt");
        escribirOutputStream(fos_out);

        File fw_out = new File ("./java-repaso/src/main/java/dev/alvaromax/io/fw_out.txt");
        escribirFileWriter(fw_out);

    }    

}
