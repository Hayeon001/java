package overloading;

public class App {

	public static void main(String[] args) {
		calculator c = new calculator();
//		System.out.println(c.sum2(10, 20));
//		System.out.println(c.sum3(10, 20, 30));
//		System.out.println(c.sum4(10, 20, 30, 40)); //더 많아지면 어려움.

		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30));
		System.out.println(c.sum(10, 20, 30, 40));
	}

}
