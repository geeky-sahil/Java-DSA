package DSA.MultiDimensionalArrays;

import java.util.Scanner;

public class rollNoAndMarks {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the number of student entities:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of marks entities:");
        int cols=sc.nextInt();
        int [][]arr=new int[rows][cols];
        System.out.println("Enter roll number and respective marks:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println("Final Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+"|");
                
            }
            System.out.println();
        }
    }
    
}
