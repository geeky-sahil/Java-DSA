import java.util.Scanner;
import java.util.*;

public class findingDoublet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number whose sum is to be searched");
        int s=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]+arr[j]==s){
                    System.out.println("Array Found"+arr[i]+" +"+arr[j]);
                    break;
                }
            }
        }
    }
    
}
