import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        double []arr=new double[n];
        n=arr.length;
        System.out.println("Enter the number of elements one by one:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
        
    }
    double sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum =sum+arr[i];
    }
    System.out.println(sum);

    
    }
}

