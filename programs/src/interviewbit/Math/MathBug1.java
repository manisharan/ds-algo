package interviewbit.Math;

public class MathBug1 {

    public static void main(String[] args) {
        MathBug1 mathBug1 = new MathBug1();
        System.out.println(mathBug1.isPrime(8));
    }

    public int isPrime(int A) {
        if( A <=1) return 0;
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }
}