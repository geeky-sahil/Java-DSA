import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class sort0and1_M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int []arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    
}
