package interviewbit.Math;


import java.util.ArrayList;

public class MathBug2 {

    public static void main(String[] args) {
        MathBug2 mathBug2 = new MathBug2();
        System.out.println(mathBug2.squareSum(1000));
    }

    public ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int a = 0; a * a < A; a++) {
            for (int b = a; b * b < A; b++) {
                if (a * a + b * b == A) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                }
            }
        }
        return ans;
    }
}
