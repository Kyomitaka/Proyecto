/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author kiyomi
 */
public class Mesa {
    private int numeroMesa; // Número de la mesa
    private int cantidadSillas; // Cantidad de sillas en la mesa
    private boolean estado; // Estado de la mesa: true = Ocupada, false = Disponible
    private boolean vistaAlMar; // Indica si la mesa tiene vista al mar
    private Mesero meseroAsignado; // Mesero asignado a esta mesa

    // Constructor de la clase Mesa
    public Mesa(int numeroMesa, int cantidadSillas, boolean vistaAlMar) {
        this.numeroMesa = numeroMesa; // Asigna el número de mesa
        this.cantidadSillas = cantidadSillas; // Asigna la cantidad de sillas
        this.estado = false; // Todas las mesas inician como desocupadas
        this.vistaAlMar = vistaAlMar; // Establece si la mesa tiene vista al mar
    }

    // Methods Getters y Setters para acceder y modificar los atributos
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado; // Actualiza el estado de la mesa
    }

    public boolean isVistaAlMar() {
        return vistaAlMar;
    }

    public void setMeseroAsignado(Mesero mesero) {
        this.meseroAsignado = mesero; // Asigna un mesero a la mesa
    }

    public Mesero getMeseroAsignado() {
        return meseroAsignado;
    }
}