// Write a method that computes the sum of the digits in an integer
package lecturesix;

public class firstsproblem {

    public static void main(String[] args) {
        long n = 1025;
        int ans = sumDigits(n);
        System.out.print("Sum:" + ans);

    }

    public static int sumDigits(long n) {

        int sum = 0;
        while (n != 0) {

            int digit = (int)(n % 10);
            sum += digit;
            n = n / 10;
        }

        return sum;
    }

}
