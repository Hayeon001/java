package ws0228;

public class Manager {
	private String id;
	private String name;
	private int salary;
	private int bonus;

	public Manager() {
		this.id = "101";
		this.name = "m1";
		this.salary = 2000000;
		this.bonus = 200000;
	}

	public Manager(String id, String name, int salary,int bonus) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
		if(bonus < 0) {
			this.bonus = 0;
		} else {
			this.bonus = bonus;
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
		return this.salary * 12 + bonus;
	}

	public double getTax() {
		return this.getAnnSalary() * 0.175;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	

}


