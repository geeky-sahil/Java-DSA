package DSA.MultiDimensionalArrays;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int [][]arr=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }int num=Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(num<arr[i][j]){
                    num=arr[i][j];
                }
                
            }
            System.out.println("Greatest Element:"+num);
            
        }

    }
    
}
