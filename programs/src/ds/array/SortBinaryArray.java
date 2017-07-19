package ds.array;

public class SortBinaryArray {

    public static void main(String[] args) {
        int[] input = {1,0,0,1,1,0,0,0,1};

        int zeros = 0, ones = 0;
        for(Integer val : input){
            if(val == 0) zeros++;
            else ones++;
        }

        for(int i=0; i<zeros; i++){
            input[i] = 0;
        }
        for(int i=zeros; i<input.length; i++){
            input[i] = 1;
        }

        for(Integer val : input){
            System.out.println(val);
        }
    }
}
