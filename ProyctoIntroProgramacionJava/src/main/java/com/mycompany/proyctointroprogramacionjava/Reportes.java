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
public class Reportes {
    
    private String personasAorrantes;
    private String personasConPrestamos;
    private String serviciosPagadosEmpleados;
    private String personasAsociadas;

    public Reportes(String personasAorrantes, String personasConPrestamos, String serviciosPagadosEmpleados, String personasAsociadas) {
        this.personasAorrantes = personasAorrantes;
        this.personasConPrestamos = personasConPrestamos;
        this.serviciosPagadosEmpleados = serviciosPagadosEmpleados;
        this.personasAsociadas = personasAsociadas;
    }

    public String getPersonasAsociadas() {
        return personasAsociadas;
    }

    public void setPersonasAsociadas(String personasAsociadas) {
        this.personasAsociadas = personasAsociadas;
    }

    public String getPersonasAorrantes() {
        return personasAorrantes;
    }

    public void setPersonasAorrantes(String personasAorrantes) {
        this.personasAorrantes = personasAorrantes;
    }

    public String getPersonasConPrestamos() {
        return personasConPrestamos;
    }

    public void setPersonasConPrestamos(String personasConPrestamos) {
        this.personasConPrestamos = personasConPrestamos;
    }

    public String getServiciosPagadosEmpleados() {
        return serviciosPagadosEmpleados;
    }

    public void setServiciosPagadosEmpleados(String serviciosPagadosEmpleados) {
        this.serviciosPagadosEmpleados = serviciosPagadosEmpleados;
    }
    
    
                        
}
