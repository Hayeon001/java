package whilecontrol;

public class P92_1 {

	public static void main(String[] args) {
		System.out.println("Start..");
		int cnt = 0; //카운트
		for (int i=1 ; i<=100 ; i++) {     //0부터 9까지 10번 실행
			System.out.println(i);       //ㅑ=0,0 넣고 실행하고 증가.증가된i 넣고 실행. 10이 되어 들어가면 <10 때문에 끝나버림
			cnt++;
		}
		System.out.println("End.." +cnt);
	}

}
