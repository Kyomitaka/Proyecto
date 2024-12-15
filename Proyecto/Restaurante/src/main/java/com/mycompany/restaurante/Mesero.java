/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author kiyomi
 */
public class Mesero {
    private int idMesero; 
    private String nombreCompleto; // Nombre completo del mesero
    private String turno; // Turno de trabajo del mesero (mañana, tarde, noche)
    private double propinas; // Total de propinas acumuladas (falta integrar)
    private double rating; // Rating inicial del mesero

    // Constructor de la clase Mesero
    public Mesero(int idMesero, String nombreCompleto, String turno) {
        this.idMesero = idMesero; 
        this.nombreCompleto = nombreCompleto;                                                
        this.turno = turno; 
        this.propinas = 0; // Inicializa las propinas en 0
        this.rating = 5; // Inicializa el rating en 5
    }

    // Metodos Getters y Setters para acceder y modificar los atributos
    public int getIdMesero() {
        return idMesero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTurno() {
        return turno;
    }

    public void addPropina(double propina) {
        this.propinas += propina; // Suma propinas a las acumuladas (falta incluir)
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double nuevoRating) {
        this.rating = nuevoRating; // Actualiza el rating del mesero (falta incluri)
    }
}