
public class Prog2 {
    
   public double calificacion(double m,double a,double i){
       double g=0;
       
       double sum=m+a+i;
       double cal=sum/3;
       if(cal > 7){
           
           System.out.println("Aprobaste felicidades");
       }else{
           System.out.println("Reprobaste intentalo el otro año");
       }
       
       
       return g;
   } 
}
