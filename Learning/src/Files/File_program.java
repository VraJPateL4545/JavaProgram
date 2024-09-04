package Files;
import java.io.File;
import java.io.IOException;

public class File_program {

	public static void main(String[] args) {
	    try {  
	        File myObj = new File("C:\\Users\\Vraj Raj\\Desktop\\demo.txt");  
	        if (myObj.createNewFile()) {  
	          System.out.println("File created: " + myObj.getName());  
	        } else {  
	          System.out.println("File already exists.");  
	        }  
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();  
	      }  
	    }  
	  }