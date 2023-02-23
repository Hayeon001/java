package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("명령어를 입력하십시오(q,i,d,s)"); //여기까지 하고 일시중지
		String cmd = sc.next();
		System.out.printf("%s를 입력 했습니다.", cmd);  //콘솔창에 값을 넣으면 다시 진행. 마지막 요청까지 끝나면 종료
		sc.close();  //원론적 내용. 닫아줘야함 (???)
	}

}
