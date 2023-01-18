public class PrimeNumbers {
    public static void main(String[] args) {
        // while loop
        int number1 = 2, number2 = 100;
        while (number1 <= number2) {
            int i = 2, count = 0;
            while (i <= number1 / 2) {
                if (number1 % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(number1 );
            }
            number1++;
        }
    }
}
