
package javaapplication21;

public class clase {
    
       String NOM;
       double PAGMAT=50000;
       
       
       double calcular(  double PAT, int EST)
       {
            if (PAT > 2000000 && EST > 3){
            PAGMAT = PAGMAT +0.03 * PAT;
       }

       return PAGMAT;
}
}
