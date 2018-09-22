
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
public class Tesprog4 {
    
    public static void main(String[] args){
        Prog4 n=new Prog4();
        Scanner g=new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero=g.nextInt();
        n.primos(numero);
        
    }
    
}
