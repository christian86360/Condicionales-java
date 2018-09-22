/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrishata
 */
public class Prog5 {
    
    public double promedio(double m,int a,int i){
        double g=0;
       
       double sum=(m+a+i)/3;
       
      // double cal=sum/3;
       if(sum < 7){
           
           System.out.println("Aprobaste tu promedio es:"+sum);
       }else {
           System.out.println("reprobaste tu promedio es"+sum);
       }
        System.out.println("Tu promedio es: "+sum);
       
       return g;
    }
    
}
