package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find all sub-arrays in the input array whose sum is equal to 0.
 */
public class AllSubArrayWith0Sum {

    public static void main(String[] args) {
        AllSubArrayWith0Sum allSubArrayWith0Sum = new AllSubArrayWith0Sum();

        int[] input = {3,4,-7,3,1,3,1,-4,-2,-2};

        Map<Integer, ArrayList<Integer>> sumOccurenceMap = new HashMap<>();
        ArrayList<Integer> defaultList = new ArrayList<>();
        defaultList.add(-1);
        sumOccurenceMap.put(0, defaultList); // this value insertion is important

        int sum = 0;
        for(int i=0; i<input.length; i++){
            sum += input[i];

            if(sumOccurenceMap.containsKey(sum)){
                for(int j=0; j<(sumOccurenceMap.get(sum).size()); j++) {
                    System.out.println(i + " .. " + (sumOccurenceMap.get(sum).get(j)+1));
                }
            }
            allSubArrayWith0Sum.insertIntoMap(sumOccurenceMap, sum, i);
        }
    }

    private void insertIntoMap(Map<Integer, ArrayList<Integer>> sumOccurenceMap, int sum, int index){
        if(sumOccurenceMap.containsKey(sum)){
            sumOccurenceMap.get(sum).add(index);
        }else {
            ArrayList<Integer> indexoccurence = new ArrayList<>();
            indexoccurence.add(index);
            sumOccurenceMap.put(sum, new ArrayList<>(indexoccurence));
        }
    }
}
