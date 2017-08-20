package interviewbit.Math;

import java.util.ArrayList;

/**
 * Created by z002l4m on 8/18/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(10));
    }

    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=A; i++){
            if((i % 3 == 0) && (i % 5 == 0)) System.out.print("FizzBuzz ");
            else if(i % 3 == 0) System.out.print("Fizz ");
            else if(i % 5 == 0) System.out.print("Buzz ");
            else System.out.print(i+" ");
        }
        return list;
    }
}
