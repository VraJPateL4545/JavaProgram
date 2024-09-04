package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_read {

	public static void main(String[] args) {
	    try {
	        File main = new File("C:\\\\Users\\\\Vraj Raj\\\\Desktop\\\\demo.txt");
	        Scanner x = new Scanner(main);
	        while (x.hasNextLine()) {
	          String data = x.nextLine();
	          System.out.println(data);
	        }
	        x.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    }
	  }