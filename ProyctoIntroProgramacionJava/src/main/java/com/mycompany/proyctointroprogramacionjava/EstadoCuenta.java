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
public class EstadoCuenta {
    
    private String nombreEmpleado;
    private int IdEmpleado;
    private double saldoPrestamo;
    private double SaldoAhorro;

    public EstadoCuenta(String nombreEmpleado, int IdEmpleado, double saldoPrestamo, double SaldoAhorro) {
        this.nombreEmpleado = nombreEmpleado;
        this.IdEmpleado = IdEmpleado;
        this.saldoPrestamo = saldoPrestamo;
        this.SaldoAhorro = SaldoAhorro;
    }

    public double getSaldoAhorro() {
        return SaldoAhorro;
    }

    public void setSaldoAhorro(double SaldoAhorro) {
        this.SaldoAhorro = SaldoAhorro;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public double getSaldoPrestamo() {
        return saldoPrestamo;
    }

    public void setSaldoPrestamo(double saldoPrestamo) {
        this.saldoPrestamo = saldoPrestamo;
    }
    
    
    
    
}
