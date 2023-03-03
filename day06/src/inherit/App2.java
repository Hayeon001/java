package inherit;

public class App2 {

	public static void main(String[] args) {
		//하위클래스 is a 상위클래스
		//Manager is a Employee
		Manager e = new Manager("100", "James", 500, 50);
		//Manager m = new Employee("100", "James", 500); //역방향은 성립안해 // 모든사원은 매니저 아니야
		
		Emloyee ea[] = new Emloyee[5]; //하나의 타입인데, 상속에 의해 다형성 구현
		ea[0] = new Emloyee("100", "James", 500);
		ea[1] = new Emloyee("101", "James", 500);
		ea[2] = new Manager("102", "James", 500, 50);
		ea[3] = new Manager("103", "James", 500, 50);
		ea[4] = new Sales("104", "James", 500, "seoul", 0.35);
	
		for (Emloyee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			//sales직원의 incentive가 얼마인지
			if (em instanceof Sales) { //배열에서 나온 em의 타입이 sales니?비교하는것
				Sales s = (Sales)em; //Employee형태를 바꿔서 사용하겠다
				System.out.println(s.getIncentive());
			}
		}
	}

}
