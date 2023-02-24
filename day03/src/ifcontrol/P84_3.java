package ifcontrol;

public class P84_3 {

	public static void main(String[] args) {
		String grade = ""; //아직 등급 모를경우
		String gender = "M";
		double sum = 80.0;
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}
			
		//switch
		switch(grade) {  //if처럼 조건에 맞춰 끝나지 않고 계속 흘러감. 그래서 케이스마다 break사용
		//실수는 못들어간다 ...(??)
		case "FVIP":
		case "MVIP":	
			sum += 100;
			//break;  //break가 없다면 gold도 받고 10도 받아   .....???왜 똑같지
		case "FGOLD":
		case "MGOLD":
			sum += 90;
			//break;  //슈퍼관리자는 모든 기능을 다 가져야할때 등 권한부여할떄 switch가 유리
		default:
			sum += 10;
		}
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		
		System.out.println("End....");

	}

}
