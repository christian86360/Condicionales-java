
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
public class Tesprog3 {
    
    
    public static void main(String[]args){
        Prog3 n=new Prog3();
        Scanner g=new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero=g.nextInt();
        n.par_impar(numero);
        
        
    }
    
}
