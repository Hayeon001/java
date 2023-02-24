package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		//합과 평균을 구하시오
		//짝수만
		
		
		int sum = 0;
		double avg = 0.0;  //평균은 소수가 나오기에 double이 맞아
		
		System.out.println("Start..");
		int cnt = 0; //카운트
		for (int i=1 ; i<=100 ; i++) {     
			if(i%2 == 0) {
				sum += i;
				cnt++;
			}
		}
		
		avg = sum / (cnt*1.0);  //int형태  cnt, sum을 실수로 바꾸는 방법
		//avg = sum / cnt;
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End.." + cnt);
	}

	
}
