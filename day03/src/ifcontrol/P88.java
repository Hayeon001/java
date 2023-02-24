package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = ""; //아직 등급 모를경우
		String gender = "M";
		double sum = 80.0;
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}
		
		//고객관리등급 변경
		//100~95, 90~85 VIP	//80~75, 60~55 GOLD	//나머지 NORMAL
		
		
		
		if((sum <= 100 && sum >= 95) || (sum <= 95 && sum >= 80)) {  //또는 or ||
			grade = "VIP";
		} else if ((sum <= 80 && sum >= 75) || (sum <= 60 && sum >= 55)) {
			grade = "GOLD";
		} else { 
			grade = "NORMAL";
		}
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			//return;  
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		
		System.out.println("End....");

	}

}
