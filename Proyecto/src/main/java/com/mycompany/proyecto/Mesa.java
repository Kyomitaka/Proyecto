/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

public class Mesa {
    private int Cantidad_Mesa;
    public int Numero_Mesa;
    public int Cantidad_Sillas;
    public String estado;
    boolean Vista_Mar;
    public String Mesero;

    Mesa(int i, int Cantidad_Sillas, String estado, boolean Vista_Mar, String Mesero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getInfo() {
        return ("Numero de mesa: " + Numero_Mesa + "\n" +
                "Cantidad de sillas: " + Cantidad_Sillas + "\n" +
                "Estado: " + estado + "\n" +
                "Vista al mar: " + Vista_Mar );
              
 }
    public void setInfo(int Numero_Mesa, int Cantidad_Sillas, String estado, String Vista_Mar){
        this.Numero_Mesa = Numero_Mesa;
        this.Cantidad_Sillas = Cantidad_Sillas;
        this.estado = estado;
        Vista_Mar= Vista_Mar;
 }

    void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}