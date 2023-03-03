package inherit2;

public class Sales extends Emloyee {
	private String loc;
	private double rate;
	
	public Sales() {
	};
	
	//사원정보
	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		
	}

	//지역포함 모든정보
	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString()+" "+loc+" "+rate;
	}
	
	//getAnnSalary 재정의 (다형성효과)
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() *12);
		return result;
	}
	
	//인사고과에 따른 월급 함수
	@Override
	public double getIncentive() {
		double result =0.0;
		result = getSalary() * this.rate;
		return result;
	}
	
}
