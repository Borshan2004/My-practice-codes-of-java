
package lecturethreepartone;


import java.util.Scanner;

public class primenumber {
    
    
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
        boolean flag = true;
        
        System.out.print("Enter the number:");
        int number = input.nextInt();
        
        for(int i=2;i<number;i++){
        
            if(number%i==0){
                flag = false;
                break;
            }
            
            
            
            
        }
        
        if(flag==true){
            System.out.println("Number is Prime number");
            
        }
        else{
            System.out.println("Number is not Prime number");
        }
        
        
        
        
        
    }
    
}
