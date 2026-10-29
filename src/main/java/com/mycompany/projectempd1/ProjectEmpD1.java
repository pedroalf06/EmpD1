/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectempd1;

import java.util.Scanner;

/**
 *
 * @author UNPA
 */
public class ProjectEmpD1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String nombre, dpto, puesto;
        int opc;
        
        do{
        
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1 - Trabajador hora; 2 - Asalariado; 3 -  Salir");
        opc = sc.nextInt();
        
        switch(opc){
       
       case 1: 
        EmpleadoH h = new EmpleadoH();
        
        sc.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese dpto ");
        dpto = sc.nextLine();
        
        System.out.println("Ingrese puesto: ");
        puesto = sc.nextLine();
        
        System.out.println("ingrese horas trabajadas");
        int ht = sc.nextInt();
        
        System.out.println("Ingrese cuota hora");
        double ch = sc.nextDouble();
        
        h.setNombre(nombre);
        h.setDpto(dpto);
        h.setPuesto(puesto);
        h.setHt(ht);
        h.setCh(ch);
        h.calcularH();
        System.out.println("Nombre: "+h.getNombre());
        System.out.println("Sueldo Quincenal: "+h.getSueldoQH());
       break; 
       
       case 2:
           
        EmpleadoS s = new EmpleadoS();
        
        sc.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese dpto ");
        dpto = sc.nextLine();
        
        System.out.println("Ingrese puesto: ");
        puesto = sc.nextLine();
        
        System.out.println("Ingrese sueldo mensual fijo: ");
        double salario = sc.nextDouble();
        
        s.setNombre(nombre);
        s.setDpto(dpto);
        s.setPuesto(puesto);
        s.setSalario(salario);
        s.calcularS();
        System.out.println("Nombre: "+s.getNombre());
        System.out.println("Sueldo Quincenal: "+s.getSueldoQS());
   break;
   
       case 3: System.out.println("Adios");
       break;
       
       default: System.out.println("Opcion invalida");
       break;
       
        }
        }while(opc != 3);
        
      }
}
