public class EvenFibonnaciNumbers {
    int number1 = 1;
    int number2 = 2;


    public int generateNumber(int limit) {
        int sum = 0;
        while (this.number2 < limit) {
            if (this.number2 % 2 == 0) {
                sum += this.number2;
            }
            int key = this.number2;
            this.number2 += this.number1;
            this.number1 = key;
        }
        return sum;
    }

    public static void main(String[] args) {
        EvenFibonnaciNumbers e = new EvenFibonnaciNumbers();
        System.out.println(e.generateNumber(4000000));
    }
}
