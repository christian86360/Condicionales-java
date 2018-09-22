
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Prog13 {
    
public String romanos(int r){
    String g=",";

      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
      
        
      int u=r%10;  
      int d=(r/10)%10;  
      int c=r/100;  
      
      if(r>=100){
          
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{  
          if(r>=10){  
              System.out.println(Decena[d]+Unidad[u]);            
          }else{  
              System.out.println(Unidad[r]);            
          }
      }
      return g;
 }


}
    



