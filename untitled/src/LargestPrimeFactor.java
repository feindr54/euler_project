public class LargestPrimeFactor {

    public boolean isPrime(long n) {
        for (int i = 2; i <= Math.pow(n,0.5); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LargestPrimeFactor e = new LargestPrimeFactor();
        long number = 600851475143L;

        while (!e.isPrime(number)) {
            for (int i = 2; i <= Math.pow(number, 0.5); i++) {
                if (number % i == 0) {
                    number /= i;
                    break;
                }
            }
        }
        System.out.println(number);
    }
}
