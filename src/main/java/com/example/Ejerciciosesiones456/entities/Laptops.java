package com.example.Ejerciciosesiones456.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "computadores")
public class Laptops {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String memoria_RAM;
    private String disco_duro;
    private String tarjeta_grafica;

    // constructores

    public Laptops(){

    }
    public Laptops(Long id, String memoria_RAM, String disco_duro, String tarjeta_grafica){
        this.id = id;
        this.memoria_RAM = memoria_RAM;
        this.disco_duro = disco_duro;
        this.tarjeta_grafica = tarjeta_grafica;
    }

    //GETTER AND SETTER


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemoria_RAM() {
        return memoria_RAM;
    }

    public void setMemoria_RAM(String memoria_RAM) {
        this.memoria_RAM = memoria_RAM;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    public String getTarjeta_grafica() {
        return tarjeta_grafica;
    }

    public void setTarjeta_grafica(String tarjeta_grafica) {
        this.tarjeta_grafica = tarjeta_grafica;
    }

    //To string

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", memoria_RAM='" + memoria_RAM + '\'' +
                ", disco_duro='" + disco_duro + '\'' +
                ", tarjeta_grafica='" + tarjeta_grafica + '\'' +
                '}';
    }
}
