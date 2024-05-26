import java.util.Scanner;//Two Pointer Method
import java.util.*;

public class sort0and1_M3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n=sc.nextInt();
    System.out.println("Enter the elements one by one:");
    int []arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
     arr[i]=sc.nextInt();   
    }
    //Method-1
    // for (int i = 0; i < arr.length; i++) {
    //     for (int k = 0; k < n-1; k--) {
    //     if(arr[i]==0){
    //         i++;
    //     }
    //     if(arr[k]==1){
    //         k--;

    //     }
    //     if(arr[i]==1 && arr[k]==0){
    //         swap(arr[i],arr[k]);
    //         i++;
    //         k--;
    //     }
    int i=0,j=n-1;
    while(i<j){
        if(arr[i]==0)i++;
        if(arr[j]==1)j--;
        if(arr[i]==1 && arr[j]==0){
            arr[i]=0;arr[j]=1;
            i++;
            j--;
        }
        
    }

}
}



