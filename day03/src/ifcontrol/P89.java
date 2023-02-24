package ifcontrol;

public class P89 {

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
		//남자 90점이상 MVIP //여자 90점이상 FVIP
		//남자 80점이상 MGOLD //여자 80점이상 FGOLD
		//남자 나머지 MNORMAL //여자 나머지 FNORMAL
			
		/*
		 * if(gender.equals("M")) { if(sum >= 90.0) { grade = "MVIP"; } else if(sum >=
		 * 80.0) { grade = "MGOLD"; } else { grade = "MNORMAL"; } } else { if(sum >=
		 * 90.0) { grade = "FVIP"; } else if(sum >= 80.0) { grade = "FGOLD"; } else {
		 * grade = "FNORMAL"; } }
		 */
		grade = (gender.equals("M")) ?  //1항
				((sum >= 90) ? "MVIP" : (sum >= 80) ? "MGOLD" : "MNORMAL")  //2항
				:((sum >= 90) ? "FVIP" : (sum >= 80) ? "FGOLD" : "FNORMAL");  //3항
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		
		System.out.println("End....");


	}

}
