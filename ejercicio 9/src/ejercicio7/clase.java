
package ejercicio7;
  


public class clase {
    
    int x;
    
    int calcularx(int a, int c, int b, int y)
    {
        if ((y < a) && (a < b && b < c)) {
          x = 0;   
        }
        else if (a <= y && y < b){
            x=1;
        }
        else if (b <= y && y < c){
         x= 2;
        }
        else if(c <= y){
          x=3;  
        }
        else{
            x=4;
        }
        
        return x;
        
        
    }
    
}
