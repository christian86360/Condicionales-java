
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
public class Tesprog12 {
    public static void main(String[] args){
        Prog12 obj=new Prog12();
        Scanner g=new Scanner(System.in);
        int a,b;
        System.out.println("Ingresa un numero");
        a=g.nextInt();
        System.out.println("Ingresa otro numero");
        b=g.nextInt();
        obj.divisores(a, b);
        
        
    }
}
