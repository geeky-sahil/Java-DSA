import java.util.*;
public class shallowCopyOfArray {
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
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        } 
        System.out.println(arr[0]);//shallow copy make changes to main array also
        
    }
    
}
