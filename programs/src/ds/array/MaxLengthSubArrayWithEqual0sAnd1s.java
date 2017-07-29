package ds.array;

public class MaxLengthSubArrayWithEqual0sAnd1s {

    public static void main(String[] args) {
        int[] input = {0,0,1,0,1,0,0};
        for(int i=0; i< input.length; i++){
            if(input[i] == 0) input[i] = -1;
        }
        System.out.println(new MaxLengthSubArrayWithGivenSum().maxLengthSubArrayWithGivenSum(input, 0));
    }
}
