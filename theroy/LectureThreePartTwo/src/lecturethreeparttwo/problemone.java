
package lecturethreeparttwo;


import java.util.Scanner;

public class problemone {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x,m,sum=1,term=1;
        
        System.out.print("Enter the value of the m : ");
        m= input.nextInt();
        
        System.out.print("Enter the value of the x : ");
        x= input.nextInt();
        
        
        for(int i=1;i<=m;i++){
            
            term = term*x;
            sum=sum+term;
        
        
        }
        System.out.println("The sum of the series is : "+ sum );
    }
    
}
