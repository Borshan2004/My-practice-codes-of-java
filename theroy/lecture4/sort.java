
package lecture4;

import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        int[] array = {10,1,2,12,15,5,18,19};
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
}
}
