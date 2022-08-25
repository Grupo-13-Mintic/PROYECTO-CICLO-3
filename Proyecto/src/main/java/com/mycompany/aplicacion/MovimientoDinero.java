/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

/**
 *
 * @author juanj
 */
public class MovimientoDinero {
    
    private double montoMovimiento;
    private String descripcionMovimiento;
    private String usuario;

    public MovimientoDinero() {
    }

    public MovimientoDinero(double montoMovimiento, String descripcionMovimiento, String usuario) {
        this.montoMovimiento = montoMovimiento;
        this.descripcionMovimiento = descripcionMovimiento;
        this.usuario = usuario;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
