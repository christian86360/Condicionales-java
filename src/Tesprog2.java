
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrishata
 */
public class Tesprog2 {
    
  public static void main(String[] args){
      
      Scanner g=new Scanner(System.in);
      Prog2 obj=new Prog2();
      System.out.println("Promedio de materia de matematicas:");
      double m=g.nextDouble();
      System.out.println("Promedio de materia de administracion:");
      double a=g.nextDouble();
      System.out.println("Promedio de la materia de informatica:");
      double i=g.nextDouble();
      obj.calificacion(m, a, i);
      
  }  
    
}
