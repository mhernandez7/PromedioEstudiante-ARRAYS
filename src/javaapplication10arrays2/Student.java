/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10arrays2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Student {
    
   private String nombre;
   private int codigo;
   private float promedio;
   private int validacion;

    public Student() {
      this.nombre ="";
      this.codigo = 0;
      this.promedio = 0;  
        
    }

    public Student(String nombre, int codigo, float promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.promedio = promedio;
    }
   
    public void solicitudNumero(ArrayList<Student>lista){
    Scanner read = new Scanner(System.in);
    Student estudi;
    do{
        System.out.println("Ingrese su nombre");
        this.nombre = read.next();
        System.out.println("Ingrese su codigo");
        this.codigo= read.nextInt();
        System.out.println("Ingrese su promedio");
        this.promedio= read.nextInt();
        estudi = new Student(this.nombre,this.codigo,this.promedio);
        lista.add(estudi);
        System.out.println("para ingresar otro promedio digite 1) para salir 2)");
        this.validacion= read.nextInt();
    
    
    }while(this.validacion != 2);
    
    
    }
   public void validacion(ArrayList<Student>lista){
       float avgT =0;
       for(int i = 0; i<lista.size(); i++){
       
           System.out.println("los datos del registro son: "+lista.get(i));
           avgT += lista.get(i).promedio;
       
       }
            System.out.println("El promedio total de los estudiantes es de: "+avgT/lista.size());
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("nombre=").append(nombre);
        sb.append(", codigo=").append(codigo);
        sb.append(", promedio=").append(promedio);
        
        sb.append('}');
        return sb.toString();
    }
   
    
}
