package whilecontrol;

public class P93 {

	/*
	public static void main(String[] args) { 
	   System.out.println("Start.."); 
	   int i = 0; 
	   while(i < 10) { 
	      System.out.println(i); 
	      } 
	   System.out.println("End..");
	 */
	
	public static void main(String[] args) {
		System.out.println("Start..");
		int i = 0;
		while(i < 10) {
			System.out.println(i);  //제일먼저 1이 들어감
			i++;
		}
		System.out.println("End..");	  

	}
}
//92,93 i 값의 사용범위 차이. 93 i는 밖에서도 사용가능. 