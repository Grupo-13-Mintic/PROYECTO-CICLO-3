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
<<<<<<< HEAD:ProyectoJava_Sprint_2/src/main/java/com/mycompany/aplicacion/Aplicacion.java
        System.out.println(empresa1.getNombreEmpresa()+" "+ empresa1.getDireccion()+""+empresa1.getTelefono()+""+ "nit"+ empresa1.getNit());
=======
        System.out.println(empresa1.getNombreEmpresa()+""+ empresa1.getDireccion()+""+empresa1.getTelefono()+""+ "nit"+ empresa1.getNit());
        
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("rayan");
        System.out.println(empleado2.getNombre());
        
        Empresa empresa2 =new Empresa("celema", "manizales", 323300184, 170001);
        System.out.println(empresa2.getNombreEmpresa()+""+ empresa2.getDireccion()+""+empresa2.getTelefono()+""+ "nit"+ empresa2.getNit());
        
>>>>>>> c28cee5c122a86c410f9565a5d2073e8e9d301b8:Proyecto/src/main/java/com/mycompany/aplicacion/Aplicacion.java
    }
}
