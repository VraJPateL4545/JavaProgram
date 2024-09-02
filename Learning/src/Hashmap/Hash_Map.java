package Hashmap;
import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
	    HashMap<String, String> i = new HashMap<String, String>();
	    i.put("1", "vraj");
	    i.put("2", "uday");
	    i.put("3", "raju");
	    i.put("4", "mihir");
	    //i.get("3");
	    //i.remove("4");
	    //i.clear();
	    
	      //System.out.println(i);
	    for ( String a : i.keySet() ) {
	     
	    	
	        System.out.println("key : " + a + " value: " + i.get(a));
	    	 
	  }
	}
}