import java.util.*;
public class deepCopy {
    public static void main(String[] args) {
        int arr[]={30,10,40,23,89,34};
        for(int ele:arr){
         System.out.print(ele+" ");
        }
        System.out.println();
         int x=4;
         int y=x;
         int []nums=arr;//Shallow Copy      //pass by reference
         nums[0]=90;
          
         System.out.println(arr[0]);  
         int brr[]=Arrays.copyOf(arr,arr.length);//deep copy created
         for(int ele:brr){
            System.out.print(ele+" ");
           }
           System.out.println(arr[0]);

    }
}
