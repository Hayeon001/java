package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.makeWinningNumberMoney();

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myNum = new ArrayList<>();
		System.out.println("1~25까지의 숫자로 추첨합니다.");

		while (myNum.size() < 3) {
			System.out.println(myNum.size() + 1 + "번째 숫자 입력하세요");
			int a = 0;
			try {
				a = Integer.parseInt(sc.next());
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			if (a < 1 || a > 25) {
				System.out.println("잘못된 범위입니다.");
				continue;
			}
			if (myNum.contains(a)) {
				System.out.println("이미 입력된 숫자입니다.");
				continue;
			}
			myNum.add(a);
		}
		sc.close();

		int ranking = lotto.checkRanking(myNum);
		double prize = lotto.prizeMoney(ranking);

		System.out.println("내 번호: " + myNum);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("당첨 번호: " + lotto.getWinningNum());
		System.out.println("나의 등수: " + ranking + "등");
		System.out.println("당첨 금액: " + String.format("%,.0f", prize) + "원");
	}

}
