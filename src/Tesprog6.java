
import java.util.Scanner;


public class Tesprog6 {
    
    public static void main(String [] args){
        Prog6 trabajador=new Prog6();
        Scanner g=new Scanner(System.in);
        System.out.println("Dame tu turno laboral [1]Diurno,[2]norturna,[3]Mixta:");
        int t=g.nextInt();
        trabajador.sueldo_total(t);
        
        
        
    }
}
