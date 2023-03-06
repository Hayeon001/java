package shape;

public class App {

	public static void main(String[] args) {
		//Shape s = new Shape(10,10); //추상클래스는 골격에 불과.
		
		Shape s1 = new Ractangle(10, 20, 100, 80);
		System.out.println(s1.getXY());
		System.out.println(s1.getArea());
		System.out.println(s1.getCircumn());
	}

}
