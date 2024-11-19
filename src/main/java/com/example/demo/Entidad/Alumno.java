package com.example.demo.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Entity
public class Alumno {

    @Id
    private int id;  
    private String nombre;
    private double nota;

    // Constructor vacío (para JPA)
    public Alumno() {}

    // Constructor con parámetros
    public Alumno(int id, String nombre, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
