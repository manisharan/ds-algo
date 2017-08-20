package interviewbit.Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z002l4m on 8/18/17.
 */
public class GetPrimeNumbersTillN {
    public static void main(String[] args) {
        GetPrimeNumbersTillN getPrimeNumbersTillN = new GetPrimeNumbersTillN();
        System.out.println(getPrimeNumbersTillN.sieve(10));
    }

    public ArrayList<Integer> sieve(int a) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for(int i=2; i<=a; i++){
            if(isPrime(i)) primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public boolean isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return false;
        }
        return true;
    }
}
