package Array;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

    public static void main(String[] args) {
        int[] input = {10,20,30,5,40, -40};
        int givenSum = 0;

        Map<Integer, Integer> diffOccurenceMap = new HashMap<>();

        for(Integer val : input){
            int key = givenSum - val;
            if(diffOccurenceMap.containsKey(val)){
                System.out.println("Pair with given sum is "+ key +" "+ val);
                break;
            }else{
                diffOccurenceMap.put(key, 1);
            }
        }
    }


}
