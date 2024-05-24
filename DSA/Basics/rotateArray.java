import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int no=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int []arr=new int[no];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        for (int i = 0; i <= k; i++) {
            int j=n-k-1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        for(int ele:arr){
        System.out.println(ele);
        }
    }
    
}
/////redo 
