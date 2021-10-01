public class SmallestMultiple {

    int multiple;

    public SmallestMultiple(int n) {
        this.multiple = factoredRange(n, n+1);
    }

    public int factoredRange(int n,int i) {

            for (int j = 1; j <= n; j++) {
                if (i % j != 0) {

                    factoredRange(n, i+1);
                    break;
                }
            }
            return i;


    }

    public static void main(String[] args) {
        SmallestMultiple s = new SmallestMultiple(4);
        System.out.println(s.multiple);
    }
}
