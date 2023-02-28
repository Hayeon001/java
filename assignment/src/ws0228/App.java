package ws0228;

public class App {

	public static void main(String[] args) {
		Employee[] arrEmp = {
				new Employee("001", "e1", 1000000),
				new Employee("002", "e2", 1000000),
				new Employee("003", "e3", 1000000),
				new Employee("004", "e4", 1000000),
				new Employee("005", "e5", 1000000)
		};
	
		Manager[] arrMng = {
				new Manager("101", "m1", 2000000, 200000),
				new Manager("102", "m2", 2000000, 200000),
				new Manager("103", "m3", 2000000, 200000),
				new Manager("104", "m4", 2000000, 200000),
				new Manager("105", "m5", 2000000, 200000)
		};
		
		for(int i=0; i<2 ;i++) {
			for(int j=0; j<5; j++) {
				if(i==0) {
					System.out.println(arrEmp[j].toString());
				} else {
					System.out.println(arrMng[j].toString());
				}
			}
			System.out.println("");
		}
		
		
		for(int i=0; i<2 ;i++) {
			for(int j=0; j<5; j++) {
				if(i==0) {
					System.out.println(arrEmp[j].getName() + "의 연봉은" + arrEmp[j].getAnnSalary() + "이고, 세금은" + Math.round(arrEmp[j].getTax()) + "입니다.");
					System.out.println("");
				} else {
					System.out.println(arrMng[j].getName() + "의 연봉은" + arrMng[j].getAnnSalary() + "이고, 세금은" + Math.round(arrMng[j].getTax()) + "입니다.");
					System.out.println("");
				}
			}
			System.out.println("");
	
		}
		
		for(int i=0; i<2 ;i++) {
			int sum = 0;
			for(int j=0; j<5; j++) {
				if(i==0) {
					sum += arrEmp[j].getAnnSalary();
					if(j==4) {
						System.out.println("Employee 연봉합계는" + sum + "입니다");
					}
					
				} else {
					sum += arrEmp[j].getAnnSalary();
					if(j==4) {
						System.out.println("Manager 연봉합계는" + sum + "입니다");
					}
					
				}
			}
		}
	}

}


//Employee들의 연봉합을 출력
//manager 연봉 합