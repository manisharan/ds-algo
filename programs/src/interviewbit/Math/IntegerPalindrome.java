package interviewbit.Math;

public class IntegerPalindrome {

    public static void main(String[] args) {
        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        System.out.println(integerPalindrome.isPalindrome(121));
    }

    public boolean isPalindrome(int a) {
        char[] array = String.valueOf(a).toCharArray();
        int i=0; int j=array.length-1;
        boolean result = true;
        while(j >= i){
            if(array[i] == array[j]){
                i++;
                j--;
            }else{
                result = false;
                break;
            }
        }
        return result;
    }
}
