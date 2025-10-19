
package lecturesix;


public class array {
    public static void main(String[] args){
    
    int[] arr = {1,2,3,5,2,60};
    
    printarray(arr);
    
    }
    
    public static void printarray(int[] arr){
    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}
}
