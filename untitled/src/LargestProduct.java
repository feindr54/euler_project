import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LargestProduct {

    public static void main(String[] args) {
        LargestProduct lp = new LargestProduct();
        int maxProduct = 0;
        int currentIndex = 0;
        int[] digits = new int[1000];
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        try (BufferedReader bfr = new BufferedReader(new FileReader("1000digits.txt"))) {
            int number = bfr.read() - 48;
            while (number != -49) {
                if (number == -35 || number == -38) {
                    number = bfr.read() - 48;
                    continue;
                }
                digits[currentIndex++] = number;
                System.out.println(number);
                number = bfr.read() - 48;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException ignored) {

        }
        int product;
        //analyse the 13 products
        for (int i = 0; i < 1000 - 13; i++) {
            temp.clear();
            product = 1;
            for (int j = i; j < i + 13; j++) {
                product *= digits[j];
                temp.add(digits[j]);
            }

            if (product > maxProduct) {
                maxProduct = product;
                numbers.clear();
                for (int index = 0; index < 13; index++) {
                    numbers.add(temp.get(index));
                }
                currentIndex = i;
            }

        }

        //output
        System.out.println(maxProduct);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
