package ifcontrol;

public class P84 {

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
		
		/*//확장성, 유지보수성 떨어지는 방법
		 * if ((gender.equals("M")|(sum >= 90.0)) { grade = "MVIP"; } else if
		 * ((gender.equals("F")|(sum >= 90.0)) { grade = "FVIP"; } else if
		 * ((gender.equals("M")|(sum >= 80.0)) { grade = "MVIP"; } else if
		 * ((gender.equals("M")|(sum >= 80.0)) { grade = "MVIP"; } else if
		 * ((gender.equals("M")|(sum >= 80.0)) { grade = "MVIP"; } else if
		 * ((gender.equals("M")|(sum >= 90.0)) { grade = "MVIP"; } else
		 */
			
			
		if(gender.equals("M")) {
			if(sum >= 90.0) {
				grade = "MVIP";
			} else if(sum >= 80.0) {
				grade = "MGOLD";
			} else {
				grade = "MNORMAL";
			} 
		} else {
			if(sum >= 90.0) {
				grade = "FVIP";
			} else if(sum >= 80.0) {
				grade = "FGOLD";
			} else {
				grade = "FNORMAL";
			} 
		}
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			//return;  
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		
		System.out.println("End....");

	}

}
