
package lectureseven;


import java.util.Scanner;
public class problemone {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of city1:");
        String city1= input.nextLine();
       
        System.out.print("Enter the name of city2:");
        String city2= input.nextLine();
        
        if(city1.compareTo(city2)>0){
           System.out.print("First:"+city2+"second:"+city1);
        }
        else{
           System.out.print("First:"+city1+"second:"+city2);

            
        }
        

    
    }
    
}
