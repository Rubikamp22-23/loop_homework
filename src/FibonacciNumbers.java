public class FibonacciNumbers {
    public static void main(String[] args) {

        // for loop
        int num;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            num = i + (i - 1);


        // while loop
        int num1 = 0, num2 = 1, sum;
        System.out.println(num1);
        for (i = 0; i < 100; ++i) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
}