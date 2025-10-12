package lecturetwo;

import java.util.Scanner;

public class firstprobleminjava {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        int temp;

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == num1) {
            System.out.println("This is correct");
        }
        else{
            System.out.println("This is not correct");
        }
    }
}