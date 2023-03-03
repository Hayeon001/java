package inherit;

public class Manager extends Emloyee { //상속됨 //ctrl+Employee 해당클래스로 이동
	private double bonus;

	
	//constructor는 상속이 안되기에 다시 구현해야한다
	//source > using field
	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//source > from superclass
	public Manager() {
		super();
	}
	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}
	///////
	
	// 함수의 재정의(overriding) 상위 함수를 그대로 가져올 수도 있고, 재정의 할 수도 있다.
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.bonus *12); //상위클래스만 수정하면 바로 적용됨
		//result = (this.getSalary() + this.bonus) *12; //방법1. private -> protected (상위클래스 코드 가져올 수 있음) //방법2.상위클래스getter 지정
		return result;
		//return super.getAnnSalary();
	}

	@Override
	public String toString() {
		//return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
		return super.toString() +" "+bonus;
	}
	
	
	
	
	
}
