package lotto2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int grade = 0;
		while(true) {
			System.out.println("Input cmd..(q.s.c.p)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				break;
			}else if(cmd.equals("s")) { //start
				System.out.println("Make Number and Prize Money");
				lotto.makeWinningNumberMoney();
			}else if(cmd.equals("c")) {  //숫자3개
				System.out.println("Input 3 number :");
				int num1 = Integer.parseInt(sc.next());
				int num2 = Integer.parseInt(sc.next());
				int num3 = Integer.parseInt(sc.next());
				//넘겨주기위해 ArrayList에 담기
				ArrayList<Integer> nums = new ArrayList<Integer>();
				nums.add(num1);
				nums.add(num2);
				nums.add(num3); 
				//grade = lotto.checkRanking(nums);
				/*꽝일땐 등수 찍을 필요없음
				try {
					grade = lotto.checkRanking(nums);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(grade);
				*/
				try {
					grade = lotto.checkRanking(nums);
				} catch (Exception e) {
					e.printStackTrace();
					continue; 
				}
				System.out.println(grade);//try안에 넣어도 되지만, 코드가 지저분해짐
				
			}else if(cmd.equals("p")) {
				System.out.printf("총 당청금 %4.1f\n",lotto.getPrizeMoney());
				System.out.printf("당신의 등수 %d\n",grade);
				System.out.printf("당신의 당첨금 %4.0f\n",lotto.prizeMoney(grade));
			}
		}
		sc.close();
	}

}
