public class SmallestMultiple {

    int multiple;

    public SmallestMultiple(int n) {
        this.multiple = factoredRange(n);
    }

    public int factoredRange(int n) {
        boolean a = true;
        int i = n + 1;
        while (a) {
            for (int j = 1; j <= n; j++) {
                if (i % j != 0) {
                    i++;
                    break;
                }
                if (j == n) {
                    a = false;
                }
            }

        }
        return i;
    }

    public static void main(String[] args) {
        SmallestMultiple s = new SmallestMultiple(20);
        System.out.println(s.multiple);
    }
}
