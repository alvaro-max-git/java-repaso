package dev.alvaromax.io;

import java.io.*;

public class LeerArchivo {

    // lee inputStream
    //podemos leer byte a byte con .read(), o rellenar un array de bytes con read (byte [])

    public static void leerInputStreamByteAByte (File inputfile) {
        try (InputStream fis = new FileInputStream(inputfile)) {

            //leo byte a byte y los imprimo por la salida estándar
            int val;
            do {
                val = fis.read(); //si ha llegado al final devuelve -1
                if(val != -1) {
                    System.out.println(val);
                } else {
                    System.out.println("---FIN DEL ARCHIVO---");
                }
            } while (val != -1);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void leerInputStreamArray (File inputfile) {

        try (InputStream fis = new FileInputStream(inputfile)) {

            //leo con un array de bytes
            byte [] byteArray = new byte [4096]; //4KB
            int numBytesLeidos = fis.read(byteArray); //este método devuelve cuántos bytes ha escrito (todos, algunos...)
            System.out.println(numBytesLeidos + " bytes leídos"); // el resto en esta caso estará vacío.

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        File fis_output = new File ("./java-repaso/src/main/java/dev/alvaromax/io/fos_input.txt");
        
        leerInputStreamByteAByte(fis_output);
        leerInputStreamArray(fis_output);

    }

}
