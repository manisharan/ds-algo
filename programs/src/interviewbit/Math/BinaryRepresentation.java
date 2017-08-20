package interviewbit.Math;

public class BinaryRepresentation {
    public static void main(String[] args) {
        BinaryRepresentation binaryRepresentation = new BinaryRepresentation();
        System.out.println(binaryRepresentation.findDigitsInBinary(5));
    }

    public String findDigitsInBinary(int a) {
        StringBuilder binaryReverse = new StringBuilder();
        if(a <=1) return String.valueOf(a);
        while(a/2 > 0){
            binaryReverse.append(a%2);
            a = a/2;
        }
        binaryReverse.append(a%2);
        return binaryReverse.reverse().toString();
    }
}
