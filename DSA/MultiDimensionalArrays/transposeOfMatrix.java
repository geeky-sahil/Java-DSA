package DSA.MultiDimensionalArrays;

import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int arr[][]=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Given Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");

        // for (int j = 0; j < cols; j++) {
        //     for (int i = 0; i < rows; i++) {
        //         System.out.print(arr[i][j]+" | ");
                
        //     }
        //     System.out.println();
            
        // }
            int [][]transpose=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[i][j]=arr[j][i];
            }
            
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(transpose[i][j]+" | ");
            }
            System.out.println();
        }

    }
    
}
