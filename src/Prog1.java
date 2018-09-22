/*en un almacen se hacen un 20%* de descuento a los clientes cuya compra supere 
los 1000 de compra determina la cantidad que cada cliente debera pagar pidiendo
 del teclado importe total de su compra*/
public class Prog1 {
    
    
    public double descuento(double compra){
        double g=0;
        
        if(compra > 1000){
            
            double res=compra*.2;
            System.out.println("Tu descuento es :"+res);
            double total=compra-res;
            System.out.println("El total con tu descuento es:"+total);
            
        }
        else{
            System.out.println("No alcansas el descuento de 20%");
            
        } 
        
        return g; 
    }
    
}
