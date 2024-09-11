package inheritance;


class Employee{
	int salary = 500;
}
class Engineer extends Employee{
	int benifit = 600;
}
class main{
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer E1 = new Engineer();
		System.out.print("salary :"+ E1.salary +
				"\nBenifit :"+ E1.benifit);
		

	}

}
}