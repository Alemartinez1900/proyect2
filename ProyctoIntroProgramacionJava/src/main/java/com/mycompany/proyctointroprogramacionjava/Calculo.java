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
public class Calculo {

    private int plazo;
    private String leerPlazo;
    private double monto;
    private String leerMonto;
    private double tasaInteres;
    private double cuota;
    

    public Calculo (int plazo, String leerPlazo, double monto, String leerMonto, double tasaInteres, double cuota) {
        this.plazo = plazo;
        this.leerPlazo = leerPlazo;
        this.monto = monto;
        this.leerMonto = leerMonto;
        this.tasaInteres = tasaInteres;
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getLeerPlazo() {
        return leerPlazo;
    }

    public void setLeerPlazo(String leerPlazo) {
        this.leerPlazo = leerPlazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getLeerMonto() {
        return leerMonto;
    }

    public void setLeerMonto(String leerMonto) {
        this.leerMonto = leerMonto;
    }


    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

}
