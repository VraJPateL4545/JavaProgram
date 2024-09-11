package inheritance;
class car1{
	public void car_1() {
		System.out.print("BMW");
	}
}
class car2 extends car1 {
	public void car_2() {
		System.out.print("AUDI");
	}
}
class car3 extends car2{
	public void car_3() {
		System.out.print("RR");
	}
}

public class inheritance2 {
	public static void main (String[] args) {
	car3 v = new car3();
	v.car_1();
	v.car_2();
	v.car_3();
	}
}

