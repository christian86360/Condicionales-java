
import java.util.Scanner;


public class Tesprog1 {
    
    
  public static void main(String[] arg){
      Prog1 obj=new Prog1();
      Scanner g=new Scanner(System.in);
      System.out.println("Total de su compra");
      double compra=g.nextDouble();
      obj.descuento(compra);
      
  }  
    
}
