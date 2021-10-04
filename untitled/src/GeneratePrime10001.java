public class GeneratePrime10001 {
    int generated_prime = 4;

    public GeneratePrime10001(int n) {

        for (int i = 3; i <= n; i++) {
            if (isPrime(generated_prime)) {
                if (i == n) {
                    break;
                }
            } else {
                i--;
            }
            generated_prime++;
        }
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number == 3) {
            return true;
        }
        for (int i = 2; i <= Math.pow(number, 0.5); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GeneratePrime10001 g = new GeneratePrime10001(10001);
        System.out.println(g.generated_prime);
    }
}
