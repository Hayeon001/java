package inherit;

public class App {

	public static void main(String[] args) {
		Emloyee e = new Emloyee("100", "James", 500);
		System.out.println(e);
		System.out.println(e.getAnnSalary());
		
		Manager m = new Manager("200", "Kim", 500, 50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());

	}

}
