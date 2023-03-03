package inherit2;

public class Tax_cal {
	//연봉을 넣으면 세금이 리턴
	
	//Employee e = new Manager();
	public double getTax(Emloyee e) { //()부분에 Employee,Manager,Sales다 들어갈수있다
		double result = 0.0;
		result = e.getAnnSalary() *0.17;
		return result;
	}
	
	
}
