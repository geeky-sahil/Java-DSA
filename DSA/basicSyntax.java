import java.util.Arrays;
class basicSyntax
{
    public static void main(String[] args) 
    {
        int x=5;
        int []arr=new int[5];//initialisation
        arr[0]=10; //declaration
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}