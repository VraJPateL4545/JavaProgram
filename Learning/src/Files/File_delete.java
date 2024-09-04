package Files;

import java.io.File;

public class File_delete {

	public static void main(String[] args) {
	    File main = new File("C:\\\\Users\\\\Vraj Raj\\\\Desktop\\\\demo.txt"); 
	    if (main.delete()) { 
	      System.out.println("Deleted the file: " + main.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	}
