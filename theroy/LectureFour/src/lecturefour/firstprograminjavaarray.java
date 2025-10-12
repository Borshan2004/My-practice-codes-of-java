package lecturefour;

import java.util.Scanner;

public class firstprograminjavaarray {

  
    
    public static void main(String[] args) {
        /*
        
        double[] first_array = new double[5];
        
        first_array[0]=10.2;
        first_array[1]=15.2;
        first_array[2]=12.8;
        first_array[3]=18.2;
        first_array[4]=14.02;
        
            
        for(int i=0;i<first_array.length;i++){
        System.out.print(first_array[i]+"   ");
        }
         

        
        
        double[] second_array = {10.2, 20, 6.3, 521, 22, 20.36, 15};

        for (int i = 0; i < second_array.length; i++) {
            System.out.print(second_array[i] + "   ");
        }
         
        
        
        double[] third_array = new double[5];
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<third_array.length;i++){
            third_array[i]=input.nextDouble();
        }
        
        for(int i=0;i<third_array.length;i++){
            System.out.print(third_array[i]+"  ");
        }
        */
        
        
        
         double[] forth_array = new double[5];
        
        for(int i=0;i<forth_array.length;i++){
            forth_array[i]= Math.random()*100;
        }

        
        for(int i=0;i<forth_array.length;i++){
            System.out.print(forth_array[i]+"  ");
        }
        
    }
}
