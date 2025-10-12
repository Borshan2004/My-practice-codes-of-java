package lecturethreeparttwo;

import java.util.Scanner;

public class lastproblem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int s = input.nextInt();

        System.out.print("Enter the Ending number: ");
        int e = input.nextInt();

        for (int i = s; i <= e; i++) {
            for(int j=1;j<=10;j++){
                System.out.println(i+"X"+j+"="+(i*j));
            }
            System.out.print("\n\n");
        }

    }
}
