package ws0228;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.getAnnSalary() * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
