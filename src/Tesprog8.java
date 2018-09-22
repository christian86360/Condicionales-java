
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
public class Tesprog8 {
    
    public static void main(String[] args){
        Prog8 obj=new Prog8();
        Scanner g=new Scanner(System.in);
        System.out.println("cantidad al pagar");
        int total=g.nextInt();
        System.out.println("Que color de es fera es [1]azul,[2]roja[3]verde,[4]dorada");
        int esferas=g.nextInt();
        obj.total_sueldo(total,esferas);
        
        
    }
    
}
