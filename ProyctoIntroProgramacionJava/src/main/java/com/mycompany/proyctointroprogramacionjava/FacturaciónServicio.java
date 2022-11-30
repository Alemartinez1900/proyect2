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
public class FacturaciónServicio {
    
    private String ServicioSoda;
    private String ServicioAgua;
    private String ServicioElectricidad;
    private String ServicioInternet;
    private String ServicioTelefono;
    private int montoServicioSoda;
    private int montoServicioAgua;
    private int montoServicioElectricidad;
    private int montoServicioInternet;
    private int montoServicioTelefono;

    public FacturaciónServicio(String ServicioSoda, String ServicioAgua, String ServicioElectricidad, String ServicioInternet, String ServicioTelefono, int montoServicioSoda, int montoServicioAgua, int montoServicioElectricidad, int montoServicioInternet, int montoServicioTelefono) {
        this.ServicioSoda = ServicioSoda;
        this.ServicioAgua = ServicioAgua;
        this.ServicioElectricidad = ServicioElectricidad;
        this.ServicioInternet = ServicioInternet;
        this.ServicioTelefono = ServicioTelefono;
        this.montoServicioSoda = montoServicioSoda;
        this.montoServicioAgua = montoServicioAgua;
        this.montoServicioElectricidad = montoServicioElectricidad;
        this.montoServicioInternet = montoServicioInternet;
        this.montoServicioTelefono = montoServicioTelefono;
    }

    public int getMontoServicioTelefono() {
        return montoServicioTelefono;
    }

    public void setMontoServicioTelefono(int montoServicioTelefono) {
        this.montoServicioTelefono = montoServicioTelefono;
    }

    public String getServicioSoda() {
        return ServicioSoda;
    }

    public void setServicioSoda(String ServicioSoda) {
        this.ServicioSoda = ServicioSoda;
    }

    public String getServicioAgua() {
        return ServicioAgua;
    }

    public void setServicioAgua(String ServicioAgua) {
        this.ServicioAgua = ServicioAgua;
    }

    public String getServicioElectricidad() {
        return ServicioElectricidad;
    }

    public void setServicioElectricidad(String ServicioElectricidad) {
        this.ServicioElectricidad = ServicioElectricidad;
    }

    public String getServicioInternet() {
        return ServicioInternet;
    }

    public void setServicioInternet(String ServicioInternet) {
        this.ServicioInternet = ServicioInternet;
    }

    public String getServicioTelefono() {
        return ServicioTelefono;
    }

    public void setServicioTelefono(String ServicioTelefono) {
        this.ServicioTelefono = ServicioTelefono;
    }

    public int getMontoServicioSoda() {
        return montoServicioSoda;
    }

    public void setMontoServicioSoda(int montoServicioSoda) {
        this.montoServicioSoda = montoServicioSoda;
    }

    public int getMontoServicioAgua() {
        return montoServicioAgua;
    }

    public void setMontoServicioAgua(int montoServicioAgua) {
        this.montoServicioAgua = montoServicioAgua;
    }

    public int getMontoServicioElectricidad() {
        return montoServicioElectricidad;
    }

    public void setMontoServicioElectricidad(int montoServicioElectricidad) {
        this.montoServicioElectricidad = montoServicioElectricidad;
    }

    public int getMontoServicioInternet() {
        return montoServicioInternet;
    }

    public void setMontoServicioInternet(int montoServicioInternet) {
        this.montoServicioInternet = montoServicioInternet;
    }
    
    
}
