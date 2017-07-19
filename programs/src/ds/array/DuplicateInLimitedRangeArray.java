package ds.array;

public class DuplicateInLimitedRangeArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,4};
        int rangeEnd = 4;

        int xor = 0;
        for(int i=1; i<=rangeEnd; i++){
            xor ^= i;
        }

        for(int i=0; i<input.length; i++){
            xor ^= input[i];
        }

        System.out.println(xor);
    }
}
