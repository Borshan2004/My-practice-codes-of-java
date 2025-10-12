/*Read one hundred numbers, compute their average, and find out how many 
numbers are above the average.*/

package lecturefour;




public class problemone {

    public static void main(String[] args){
        int[] number = new int[100];
        
        int sum=0;
        for(int i=0;i<=number.length;i++){
            number[i] = i;
              
        }
        int average = (sum/100);
        
        System.out.print(average);
        
    }

    
}
