/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Prog12 {
    
public int divisores(int a,int b){
    int g=0;
    
    if(a%b==0){
        System.out.println("Es divisor de:"+a);
    }else{
        if(b%a==0){
            System.out.println(a+"Es divisor de "+b);
        }else{
            System.out.println("Ninguno es divisor del otro");
        }
    }
    
   return g; 
}    
    
}
