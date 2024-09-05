package Generics_Programs;
import java.util.ArrayList;

public class With_Generics {
    public static void main(String[] args) {
//        With Java Generics :

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);

        int x = myArrayList.get(3);
        System.out.println(x);

    }
}