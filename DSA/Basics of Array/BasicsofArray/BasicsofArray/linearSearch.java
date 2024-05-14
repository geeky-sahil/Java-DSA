import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements one by one");
        double []arr=new double[n];
        n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
        }
        System.out.println("Enter the number to be searched:");
        Double s=sc.nextDouble();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==s){
                System.out.println("Element found:"+arr[i]+" At Position:"+ i);
            }
        }
    }
    
}
