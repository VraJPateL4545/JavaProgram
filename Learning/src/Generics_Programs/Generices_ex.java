package Generics_Programs;

import java.util.ArrayList;

public class Generices_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
//        myArrayList.add("Harry Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
        int x = (int) myArrayList.get(0);
        System.out.println(x);

	}
}



