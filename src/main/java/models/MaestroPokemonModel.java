package models;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;

import java.util.Locale;

public class MaestroPokemonModel {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private String pais;
    private String email;
    private boolean esHombre;

    public MaestroPokemonModel(){
        var faker = new Faker(Locale.ITALY);
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.number().randomDigit();
        peso = faker.number().randomDouble(2,0,100);
        pais = faker.country().name();
        email = faker.internet().emailAddress();
        esHombre = faker.bool().bool();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsHombre() {
        return esHombre;
    }
}
