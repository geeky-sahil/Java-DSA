import java.util.Scanner;

public class maximumValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int []arr=new int[n];
        n=arr.length;
        System.out.println("Enter elements one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // int mx=arr[0];
        int mx=Integer.MIN_VALUE;//smallest integer value
        for (int i = 0; i < arr.length; i++) {

            //mx=Math.max(mx,arr[i]); 
            //remove if block
           if(arr[i]>mx) 
           {
            mx=arr[i];
           }
        }
        System.out.println("Maximum Value is:"+mx);
    }
    
}
