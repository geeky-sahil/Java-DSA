import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int []arr=new int[n];
        n=arr.length;
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        int mx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mx)
            {
                mx=arr[i];
            }
        }
        
        int smx;
        smx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=mx && arr[i]>smx)
            {
                smx=arr[i];
                //smx=Math.max(smx, arr[i]);
            }
        }
        System.out.println("Second Largest Element is:"+smx);
    }
    
}
