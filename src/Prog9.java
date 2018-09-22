
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
public class Prog9 {
    private  int a,b,c;
  // public Prog9(int a,int b,int c ){
       //this.a=a;
       //this.b=b;
       //this.c=c;
    //     } 
   public String operacion(){
     Scanner sc = new Scanner(System.in);
System.out.print("DIGITE PRIMER NUMERO: "); 
a=sc.nextInt(); 

System.out.print("DIGITE SEGUNDO NUMERO: "); 
b=sc.nextInt();  

System.out.print("DIGITE TERCER NUMERO: "); 
c=sc.nextInt();  

if((a>b&&a<c)||(a>c&&a<b)) 
System.out.print("EL DEL MEDIO ES:" + a); 
else if((b>a&&b<c)||(b>c&&b<a)) 
System.out.print("EL DEL MEDIO ES:" + b); 
else 
System.out.print("EL DEL MEDIO ES:" + c ); 
       return null;

}
   public void Imprimir(){
             System.out.println(operacion());
         }
    
}
