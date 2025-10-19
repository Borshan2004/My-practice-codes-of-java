
package lecturefive;

import java.util.Scanner;

public class problemone {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.print("Row:");
        row = input.nextInt();
        System.out.print("Col:");
        col = input.nextInt();
        
        int[][] matrix = new int[row][col];
        
        for(int i=0;i<matrix.length;i++){
        
            for(int j=0;j<matrix[i].length;j++){
                  matrix[i][j]= input.nextInt();
            }
            
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
