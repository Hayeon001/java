package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Emloyee e1 = new Emloyee();
		Emloyee e2 = new Manager();
		Emloyee e3 = new Sales();
		
		Object obj1 =  new Emloyee(); //숨겨져 있을 뿐 object에서 상속받았음
		Object obj2 =  new Manager();
		Object obj3 =  new Date();
		
	}

}
