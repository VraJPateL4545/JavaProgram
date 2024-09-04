package Files;

import java.io.FileWriter;
import java.io.IOException;

public class file_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter main = new FileWriter("C:\\\\Users\\\\Vraj Raj\\\\Desktop\\\\demo.txt");
		main.write("hello my name is vraj");
		main.close();
		System.out.print("successfully write ");
		
		}
		catch(IOException e ){
			System.out.print("error");
			e.printStackTrace();
			}
		
			
		
		

	}

}
