/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Prog8 {
    
  public int total_sueldo(int total,int esferas){
      int g=0;
      if(esferas==1){
          double azul=total*.1;
          System.out.println("Tu pago total a pagar es"+azul);
      }else if(esferas==2){
          double roja=total*.2;
          double r=total-roja;
          System.out.println("Tu pago total a pagar es: "+r);
          
      }else if(esferas==3){
          double verde=total*.3;
          double v=total-verde;
          System.out.println("Tu pago total a pagar es: "+v);
      }else if(esferas==4){
          double dorada=total*.5;
          double d=total-dorada;
          System.out.println("Felicidades Tu pago total a pagar es: "+d);
      }
      
      
      return g;
  }  
}
