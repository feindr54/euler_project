public class SumSquareDifference {
    int size;
    int sumSquare;
    int squareSum;

    public SumSquareDifference(int size) {
        this.size = size;
        this.squareSum();
        this.sumSquare();
    }

    public void sumSquare() {
        for (int i = 1; i <= this.size; i++) {
            this.sumSquare += (int) Math.pow(i, 2);
        }

    }

    public void squareSum() {
        for (int i = 1; i <= this.size; i++) {
            this.squareSum += i;
        }
        this.squareSum = (int) Math.pow(this.squareSum, 2);
    }

    public static void main(String[] args) {
        SumSquareDifference s = new SumSquareDifference(100);
        System.out.println(s.squareSum-s.sumSquare);
    }
}
