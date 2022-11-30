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
public class Prestamo {
    
    private String colaborador;
    private String prestamoPersonal;
    private String prestamoEstudiantil;
    private String prestamoSalud;

    public Prestamo(String colaborador, String prestamoPersonal, String prestamoEstudiantil, String prestamoSalud) {
        this.colaborador = colaborador;
        this.prestamoPersonal = prestamoPersonal;
        this.prestamoEstudiantil = prestamoEstudiantil;
        this.prestamoSalud = prestamoSalud;
    }

    public String getPrestamoSalud() {
        return prestamoSalud;
    }

    public void setPrestamoSalud(String prestamoSalud) {
        this.prestamoSalud = prestamoSalud;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getPrestamoPersonal() {
        return prestamoPersonal;
    }

    public void setPrestamoPersonal(String prestamoPersonal) {
        this.prestamoPersonal = prestamoPersonal;
    }

    public String getPrestamoEstudiantil() {
        return prestamoEstudiantil;
    }

    public void setPrestamoEstudiantil(String prestamoEstudiantil) {
        this.prestamoEstudiantil = prestamoEstudiantil;
    }
 
  
  
  
}



