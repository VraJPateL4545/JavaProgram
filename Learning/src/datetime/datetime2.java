package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime x = LocalDateTime.now();
		System.out.println(x);
		DateTimeFormatter x1 = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");

		String formattedDate = x.format(x1);
		System.out.println(formattedDate);		
		
		
		
	}

}
