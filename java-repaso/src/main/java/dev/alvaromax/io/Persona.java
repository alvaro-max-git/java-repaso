package dev.alvaromax.io;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona {

    //@JsonProperty("CampoJSON") es útil si el nombre en el JSON no es igual al atributo Java.

    @JsonProperty("Nombre")
    public String nombre;

    @JsonProperty("Apellido")
    public String apellido;

    @JsonProperty("Edad")
    public int edad;

    @JsonProperty("DNI")
    public String dni;

    @JsonProperty("Email")
    public String email;
}
