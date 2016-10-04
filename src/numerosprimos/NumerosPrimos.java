
package numerosprimos;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    public static void main(String[] args) {

        int max = 100;
         List <Integer> listPrimos =new ArrayList <>();
        listPrimos.add(2);
        
        for (int i = 3; i < max; i++) {
            isPrime(i, listPrimos);
        }
        
        listPrimos.add(0,1);
        
        for (Integer primo : listPrimos) {
            System.out.println(primo);
        }
        
        
        System.out.println("Nº de primos generados = " + listPrimos.size());
    }
    
    private static void isPrime (int n, List<Integer> listPrimos){
        
        for (int prime : listPrimos) {
            if (n % prime == 0) return;
        }
        listPrimos.add(n);
    }
            
}
