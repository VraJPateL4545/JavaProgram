package Generics_Programs;

import java.util.ArrayList;

public class Without_Generices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("vraj"); //String value
        myArrayList.add(20.4); //Double value
        System.out.println(myArrayList);

    }
}