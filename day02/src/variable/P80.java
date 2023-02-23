package variable;

public class P80 {

	public static void main(String[] args) {
		// 삼항연산자
		int credit = 900;  //신용점수
		String grade = (credit >= 800) ? "High" : "Low" ;  
		                //조건.800이상   이니?   이상:이하
		
		System.out.println(grade);
		
	}
	

}
