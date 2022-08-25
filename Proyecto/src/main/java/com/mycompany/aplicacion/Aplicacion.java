/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicacion;

/**
 *
 * @author juanj
 */
public class Aplicacion {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("juan");
        System.out.println(empleado1.getNombre());
        
        Empresa empresa1 =new Empresa("colanta", "medellin", 5620956, 900619011);
        System.out.println(empresa1.getNombreEmpresa()+""+ empresa1.getDireccion()+""+empresa1.getTelefono()+""+ "nit"+ empresa1.getNit());
    }
}
