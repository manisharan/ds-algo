package ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxLengthSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] input = {5,6,-5,5,3,5,3,-2,0};
        int givenSum = 8;
        System.out.println(new MaxLengthSubArrayWithGivenSum().maxLengthSubArrayWithGivenSum(input, givenSum));
    }

    public Range maxLengthSubArrayWithGivenSum(int[] input, int givenSum){
        Map<Integer,List<Integer>> sumMap = new HashMap<>();
        List<Range> outputs = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<input.length; i++){
            sum += input[i];
            if(sumMap.containsKey(sum)){
                sumMap.get(sum).add(i);
            }else{
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                sumMap.put(sum, indexList);
            }
            if(givenSum != 0) {
                if (sumMap.containsKey(sum - givenSum)) {
                    for (Integer val : sumMap.get(sum - givenSum)) {
                        outputs.add(new Range((val + 1), i));
                    }
                }
            }
        }
        if(givenSum == 0){
            Range maxRange = null;
            int maxRangeLengthTillNow = 0;
            for(Map.Entry<Integer, List<Integer>> entry : sumMap.entrySet()){
                if(entry.getValue().size() > 0){
                    int range = entry.getValue().get(entry.getValue().size()-1) - (entry.getValue().get(0)+1);
                    if(range >= maxRangeLengthTillNow){
                        maxRangeLengthTillNow = range;
                        maxRange = new Range(entry.getValue().get(entry.getValue().size()-1), (entry.getValue().get(0)+1));
                    }
                }
            }
            return maxRange;
        }
        System.out.println(outputs);
        return outputs.size() > 0 ? getMaxRange(outputs) : null;
    }

    private Range getMaxRange(List<Range> ranges){
        Range maxRange = null;
        Integer maxRangeVal = ranges.get(0).getMaxIndex() - ranges.get(0).getMinIndex();
        for(Range range : ranges){
            if((range.getMaxIndex() - range.getMinIndex()) > maxRangeVal)
                maxRange = range;
        }
        return maxRange;
    }
}
