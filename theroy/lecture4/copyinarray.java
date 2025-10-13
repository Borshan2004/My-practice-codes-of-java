
package lecture4;


public class copyinarray {

public static void main(String[] args){
    int[] array = {10,20,30,40,50,80};
    int[] copy_array = new int[array.length];
    
    for(int i=0;i<array.length;i++){
        copy_array[i]=array[i];
    }
    
    for(int i=0;i<copy_array.length;i++){
        System.out.println(copy_array[i]);
    }
    
    
    
    
}
    
}
