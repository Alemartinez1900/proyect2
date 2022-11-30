/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyctointroprogramacionjava;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Empleado {
    
    String nombre;
    int ID;
    String leerTelefono;
    int teléfono;
    String puesto;
    String leerAhorro;
    double ahorro;
    String leerTiempoLaboral;
    int tiempoLaboral;

    public Empleado(String nombre, int ID, String leerTelefono, int teléfono, String puesto, String leerAhorro, double ahorro, String leerTiempoLaboral, int tiempoLaboral) {
        this.nombre = nombre;
        this.ID = ID;
        this.leerTelefono = leerTelefono;
        this.teléfono = teléfono;
        this.puesto = puesto;
        this.leerAhorro = leerAhorro;
        this.ahorro = ahorro;
        this.leerTiempoLaboral = leerTiempoLaboral;
        this.tiempoLaboral = tiempoLaboral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLeerTelefono() {
        return leerTelefono;
    }

    public void setLeerTelefono(String leerTelefono) {
        this.leerTelefono = leerTelefono;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLeerAhorro() {
        return leerAhorro;
    }

    public void setLeerAhorro(String leerAhorro) {
        this.leerAhorro = leerAhorro;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }

    public String getLeerTiempoLaboral() {
        return leerTiempoLaboral;
    }

    public void setLeerTiempoLaboral(String leerTiempoLaboral) {
        this.leerTiempoLaboral = leerTiempoLaboral;
    }

    public int getTiempoLaboral() {
        return tiempoLaboral;
    }

    public void setTiempoLaboral(int tiempoLaboral) {
        this.tiempoLaboral = tiempoLaboral;
    }
    
    
    
    
    
}
