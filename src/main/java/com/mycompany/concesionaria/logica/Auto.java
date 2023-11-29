package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String modelo;
    private String color;
    private String patente;
    private int cantidadPuertas;

    public Auto() {
    }

    public Auto(int id, String modelo, String color, String patente, int cantidadPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto {" + "modelo=" + modelo + ", color=" + color + ", patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
}
