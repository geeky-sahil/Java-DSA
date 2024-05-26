package DSA.MultiDimensionalArrays;

import java.util.Scanner;

public class addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Matrix1
        System.out.println("For first matrix");
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        int [][]arr1=new int[rows][cols];
        System.out.println("Elements the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j]=sc.nextInt();
                
            }
            
        }
        //matrix2
        System.out.println("For second matrix");
        // System.out.println("Enter the number of rows");
        // int rows1=sc.nextInt();
        // System.out.println("Enter the number of columns:");
        // int cols1=sc.nextInt();
        int [][]arr2=new int[rows][cols];
        System.out.println("Elements the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j]=sc.nextInt();
                
            }
            
        }
        //Resultant Matrix
        int p1=rows*cols;
        int p2=rows*cols;
        if(p1>p2)
        {
            int [][]res=new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    res[i][j]=arr1[rows][cols]+arr2[rows][cols];
                    System.out.print(res[i][j]);
                }
                System.out.println();
                
            }
        }
        else
        {
            int [][]res=new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    res[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
                
            }
        }  
        
    }
    
}
