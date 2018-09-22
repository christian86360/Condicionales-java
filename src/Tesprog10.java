
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
public class Tesprog10 {
    public static void main(String[] args){
        Prog10 obj=new Prog10();
        Scanner g=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a=g.nextInt();
        System.out.println("Ingresa un numero");
        int b=g.nextInt();
        System.out.println("Ingresa un numero");
        int c=g.nextInt();
        System.out.println("Ingresa un numero");
        int d=g.nextInt();
        obj.mayor(a, b, c, d);
    }
    
}
