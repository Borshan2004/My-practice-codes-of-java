//Read one hundred numbers, compute their average, and find out how many 
//numbers are above the average.
package lecture4;


public class problemone {

    public static void main(String[] args){
        
        int[] array = new int[100];
        
        for(int i=0;i<100;i++){
            array[i]=i+1;
        }
        
        int sum=0,average;
        
        for(int i=0;i<100;i++){
        
            sum+=array[i];
            
            
        }
        average=(sum/100);
        
        int cnt=0;
        for(int i=0;i<100;i++){
        
            if(array[i]>average){
                cnt++;
            }
        }
        
        System.out.print("The amount of the number greater than average are :"+ cnt);
    }

    
}
