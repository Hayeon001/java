package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		String grade = ""; //아직 등급 모를경우
		String gender = "M";
		double sum = 80.0;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}
		
		//고객관리등급 변경
		//100~90 VIP	//89~80 GOLD	//79~70 SILVER	//69~60 BRONZE 	//59이하 NORMAL
		if (sum >= 90.0) {
			grade = "VIP";
		} else if (sum >= 80.0) {
			grade = "GOLD";
		} else if (sum >= 70.0) {
			grade = "SILVER";
		} else if (sum >= 60.0) {
			grade = "BRONZE";
		}  else {
			grade = "NORMAL";
		}		
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");}
			
		System.out.printf("%s, %s, %f \n",  grade, gender, sum);
		System.out.println("End....");

	}

}
