package ds.array;

public class Range {

    private int minIndex;
    private int maxIndex;

    public int getMinIndex() {
        return minIndex;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public Range(int minIndex, int maxIndex){
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
    }

    @Override
    public String toString() {
        return "Range{" +
                "minIndex=" + minIndex +
                ", maxIndex=" + maxIndex +
                '}';
    }
}
