import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        for(int ele:arr){
            System.out.print(ele+" ");
        
        }
        System.out.println();
        //reverse
        int n=arr.length;
        for (int i = 0; i < n/2; i++) {
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        
        }
    }
}
