
package lecture4;

public class copyusingclass {
    public static void main(String[] args){

    int[] src_arr = {1,2,3,4,5,23,6};
    int[] target_arr = new int[src_arr.length];
    
    System.arraycopy(src_arr,3,target_arr,0,src_arr.length-3);
    
    for(int i=0;i<src_arr.length;i++){
       System.out.println(target_arr[i]);
    }
    
}
}
