
package ejercicio.pkg11;


public class clase {
    
    
    int mayor;
    
    int numero_mayor( int N1,int N2,int N3)
    {
        
        if ((N1 > N2) && (N1 > N3)){
       
       mayor= N1;
       }
       else if (N2 > N3){
           mayor = N2;
       }
       else
       {
         mayor= N3;
                  
        }
       
        return mayor;
    }
    
}
