package interviewbit.Math;

import java.util.ArrayList;

public class AllFactors {
    public static void main(String[] args) {
        AllFactors allFactors = new AllFactors();
        System.out.println(allFactors.allFactors(15364));
    }

    public ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=2; i<=a/2; i++){
            if(a%i == 0) list.add(i);
        }
        list.add(a);
        return list;
    }
}
