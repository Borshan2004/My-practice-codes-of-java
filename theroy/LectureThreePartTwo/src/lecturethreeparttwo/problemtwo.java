package lecturethreeparttwo;

import java.util.Scanner;

public class problemtwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terms, sum = 0, n;

        System.out.print("Enter the number of the series :");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            terms = i * i;

            if (i % 2 == 0) {
                sum = sum - terms;
            } else {
                sum = sum + terms;

            }

        }
        System.out.print("Total sum is :"+sum) ;
    }

}
