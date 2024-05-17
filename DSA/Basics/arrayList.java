import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //int[] arr={1,2,3};
       
        // double[] brr ={3.14,2.87,5.6};
        ArrayList<Integer> arr=new ArrayList<>(6);//initialisation
        arr.add(0,10);//arr[0]=10
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //good way
        //System.out.println(arr);//default value given
        arr.set(2,300);//modify
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }System.out.println();
        //extra element
        arr.add(90);//peeche se extra element add hoga //push back
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println(arr.size());

    }
}
