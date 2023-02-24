package ifcontrol;

public class P84_1 {

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
			sum += 100;
			break;
		case "FGOLD":
			sum += 90;
			break;
		case "MVIP":
			sum += 100;
			break;
		case "MGOLD":
			sum += 90;
			break;
		default:
			sum += 10;
		//위 케이스가 아니면 defalut
		}
		
		if(grade.equals("VIP")) {   //(grade == "VIP") 아님!
			System.out.println("VIP 혜택제공....");
		}
			//return;  
			
		System.out.printf("%s, %s, %4.2f \n",  grade, gender, sum);
		
		System.out.println("End....");

	}

}
