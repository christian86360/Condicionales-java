/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Prog11 {
    
    public int articulos(int n,int l ,int r){
        int g=0;
        double total =n+l+r*.12;
        if(total >= 5000){
            
            
            System.out.println("Tienes derecho al descuento de 5%");
            double resul=total*.5;
            double result=total-resul;
            System.out.println("El total a pagar es:"+result);
                
            
            
            
        }
        
        
        
        return g;
        
        
        
        
    }
    
}
