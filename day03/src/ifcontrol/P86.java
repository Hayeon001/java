package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = ""; //아직 등급 모를경우
		String gender = "M";
		double sum = 80.0;
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}
		
		//삼항연산자로 바꾸기
		/*if(sum >= 90.0) {
			grade = "VIP";
		} else if (sum >= 70.0) {
			grade = "GOLD";
		} else { //70.0미만 모든점수
			grade = "SILVER";
		}*/
		grade = (sum >= 90.0) ? "vIP" : (sum >= 70.0) ? "GOLD" : "SILVER";
		
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			//return;  
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		//grade는 정수, gender 정수, sum 실수 \n줄바꾸기
		
		System.out.println("End....");

	}

}
