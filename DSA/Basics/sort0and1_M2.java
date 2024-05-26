import java.util.Scanner;

public class sort0and1_M2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n=sc.nextInt();
    System.out.println("Enter the elements one by one:");
    int []arr=new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();  
    }
    int noOfZeroes=0,noOfOnes=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)
        noOfZeroes++;
    }
    for (int i = 0; i < arr.length; i++) {
        arr[i]=0;
    }
    for (int i = noOfZeroes; i < arr.length; i++) {
        arr[i]=1;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
  }  
}
