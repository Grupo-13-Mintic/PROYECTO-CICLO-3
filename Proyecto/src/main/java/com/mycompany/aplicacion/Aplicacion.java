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

        //Commit de KETHER
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Kether Leal Matta");
        Empresa empresa2 = new Empresa("Universidad de Antioquia", "Calles de Medallo", 12323456, 666);
        MovimientoDinero movimiento2 = new MovimientoDinero(1800000, "venta", "Kether"  );
        System.out.println("---------------------------------");
        System.out.println(empleado2.getNombre());
        System.out.println("Empresa: " + empresa2.getNombreEmpresa() + " \n" + "Dirección: " + empresa2.getDireccion()
                + "\n " + "Teléfono: " + empresa2.getTelefono() + "\n " + "NIT: "+empresa2.getNit() + "\n " );

        System.out.println("---------------------------");
        System.out.println("Concepto: " + movimiento2.getDescripcionMovimiento() + "\\n " + "Cantidad: " + movimiento2.getMontoMovimiento() +"\\n ");

    }
}
