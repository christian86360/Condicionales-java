
import java.util.Scanner;


public class Tesprog5 {
    
  public static void main(String [] args){
      
        Scanner g=new Scanner(System.in);
      Prog2 obj=new Prog2();
      System.out.println("Promedio de materia 1:");
      double m=g.nextDouble();
      System.out.println("Promedio de materia 2:");
      double a=g.nextDouble();
      System.out.println("Promedio de la materia 3:");
      double i=g.nextDouble();
      obj.calificacion(m, a, i);
  }  
    
}
