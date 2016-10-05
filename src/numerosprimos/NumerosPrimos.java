package numerosprimos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumerosPrimos {

    public static void main(String[] args) {

        int max = 10;
        List<Integer> listPrimos = new ArrayList<>();
        listPrimos.add(2);

        for (int i = 3; i < max; i++) {
            isPrime(i, listPrimos);
        }
        
        listPrimos.add(0, 1);

        Iterator<Integer> iter = listPrimos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    private static void isPrime(int n, List<Integer> listPrimos) {

        for (int prime : listPrimos) {
            if (n % prime == 0) {
                return;
            }
        }
        listPrimos.add(n);
    }

}
