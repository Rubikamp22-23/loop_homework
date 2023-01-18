public class Hop {
    public static void main(String[] args) {

        // This program is a 5 Hop Game!

        // for loop
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Hop!!");
                continue;
            }
            System.out.println(i);
        }


        //while loop
        int i = 0;
        while (i <= 30){
            i++;
            if (i % 5 == 0){
                System.out.println("Hop!!");
                continue;
            }
            System.out.println(i);
        }
    }
}

