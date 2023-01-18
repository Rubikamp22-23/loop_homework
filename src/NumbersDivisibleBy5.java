public class NumbersDivisibleBy5 {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i <= 100; i++) {
            if (i % 5 ==0){
                System.out.println(i);
            }
        }

        // while loop
        int i = 0;
        while (i <= 100){
            i ++;
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

    }
}
