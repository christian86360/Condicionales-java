
public class Prog4 {
    
    public int primos(int n){
        int g=0;
        int i;
        int a=0;
        for(i=1; i<(n+1); i++){
            if(n%i== 0){
                a++;
            }
        }
        if(a!= 2){
            System.out.println("No es Primo");
        }else{
            System.out.println("Si es primo");
        }
        
        
        
        return g;
        
      
        
    }
    
}
