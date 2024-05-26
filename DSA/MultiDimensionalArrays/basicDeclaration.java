package DSA.MultiDimensionalArrays;
import java.util.*;

public class basicDeclaration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int [][]arr= new int[3][3];
        // // 10 20 30 
        // // 40 50 60
        // // 70 80 90
        // arr[0][0]=10;
        // arr[0][1]=20;
        // arr[0][2]=30;
        // arr[1][0]=40;
        // arr[1][1]=50;
        // arr[1][2]=60;
        // arr[2][0]=70;
        // arr[2][1]=80;
        // arr[2][2]=90;
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        int ele=rows+cols;
        int [][]arr=new int[rows][cols];
        System.out.println("Enter the elemnts one by one:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
