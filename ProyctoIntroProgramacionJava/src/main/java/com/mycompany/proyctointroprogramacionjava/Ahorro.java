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
public class Ahorro {
    
    private String empleado;
    private int IdEmpleado;
    private double montoAhorro;
    private int tiempoAhorro;
    private double saldoAhorrado;
    private double montoRetiro;

    public Ahorro(String empleado, int IdEmpleado, double montoAhorro, int tiempoAhorro, double saldoAhorrado, double montoRetiro) {
        this.empleado = empleado;
        this.IdEmpleado = IdEmpleado;
        this.montoAhorro = montoAhorro;
        this.tiempoAhorro = tiempoAhorro;
        this.saldoAhorrado = saldoAhorrado;
        this.montoRetiro = montoRetiro;
    }
    
    
    

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public double getMontoAhorro() {
        return montoAhorro;
    }

    public void setMontoAhorro(double montoAhorro) {
        this.montoAhorro = montoAhorro;
    }

    public int getTiempoAhorro() {
        return tiempoAhorro;
    }

    public void setTiempoAhorro(int tiempoAhorro) {
        this.tiempoAhorro = tiempoAhorro;
    }

    public double getSaldoAhorrado() {
        return saldoAhorrado;
    }

    public void setSaldoAhorrado(double saldoAhorrado) {
        this.saldoAhorrado = saldoAhorrado;
    }

    public double getMontoRetiro() {
        return montoRetiro;
    }

    public void setMontoRetiro(double montoRetiro) {
        this.montoRetiro = montoRetiro;
    }
    
    
    
    
}
