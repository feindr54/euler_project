public class LargestPalindromeProduct {
    int product;

    public LargestPalindromeProduct(int a, int b) {
        this.product = a * b;
    }

    public boolean isPalindrome(){
        String number = String.valueOf(this.product);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LargestPalindromeProduct p;
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                p = new LargestPalindromeProduct(i, j);
                if (p.isPalindrome() && p.product > largest) {
                    largest = p.product;
                }
            }
        }
        System.out.println(largest);
    }
}
