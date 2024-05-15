public class passingArraysToMethods
//PassByValue
{
    public static void main(String[] args) {
        int []arr={10,20,30};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    // public static void change(int x) {
    //     x=10; pass by value
    // }
    public static void change(int[] x){
        x[0]=90;//pass by reference
    }
    //array always gets passed by reference
}