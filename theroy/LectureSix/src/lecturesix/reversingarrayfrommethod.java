package lecturesix;

public class reversingarrayfrommethod {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] ans = reversearray(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] reversearray(int[] arr) {

        int[] re_ar = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            re_ar[j] = arr[i]; 
        }
        return re_ar;
    }

}


