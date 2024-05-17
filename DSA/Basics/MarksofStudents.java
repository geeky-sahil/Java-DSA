import java.util.Scanner;

public class MarksofStudents 
{
   public static void main(String[] args) 
   {
    System.out.println("Enter the numnber of students:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double []arr=new double[n];
    n=arr.length;
    for (int i = 0; i < arr.length; i++) 
    {
        arr[i]=sc.nextDouble();
    }
    for (int i = 0; i < arr.length; i++) 
    {
        if(arr[i]<35){
            System.out.println("Marks of student les than 35 are:"+arr[i]);
        }
    }
   } 
}
