package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
	UML을 기반으로 lotto 프로그램을 작성 하시오
	1. 변수 설명
	winningNum: HashSet<Integer>
	당첨 번호 1~25까지의 숫자 중 3개를 선정
	prizeMoney: double
	당첨 금액 랜덤하게 생성 ( 1 ~ 2000000000)
	2 함수 설명
	makeWinningNumberMoney(): void
	당첨 번호와 당첨금을 생성 한다.
	checkRanking(myNum: ArrayList<Integer>): int
	본인이 입력한 숫자 3개를 argument로 입력 하면
	몇개가 일치한지를 check 한후 등수를 리턴
	등수는 자유롭게 설정
	prizeMoney(grade: int): double
	등수 정보를 입력 하면 당첨 금액을 리턴
	당첨 금액 비율은 자유롭게 설정
*/
public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;

	public Lotto() {
		winningNum = new HashSet<Integer>();
		makeWinningNumberMoney();
	}

	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}

	public void makeWinningNumberMoney() {
		Random r = new Random();

		while (winningNum.size() < 3) {
			int goldenNum = r.nextInt(25) + 1;
			winningNum.add(goldenNum);
		}
		prizeMoney = r.nextInt(2000000000) + 1;
		// 상금이 더 컸다면..? nextDouble?
	}

	public int checkRanking(ArrayList<Integer> myNum) {
		int cnt = 0;
		for (int num : myNum) {
			if (winningNum.contains(num)) {
				cnt++;
			}
		}
		
		//if (cnt == 3) { return 1; } else if (cnt == 2) { return 2; } else if (cnt == 1) { return 3; } else { return 0; }
		
		return (cnt == 3 ? 1 : (cnt == 2 ? 2 : (cnt == 1 ? 3 : 0)));
	}

	public double prizeMoney(int grade) {
		/*
		if (grade == 1) { 
		return prizeMoney * 0.6; 
		} else if (grade == 2) {
		return prizeMoney * 0.3; 
		} else if (grade == 3) {
		return prizeMoney * 0.1;
		} else {
			return 0.0; 
		}
		*/
		// double rate = ((grade == 1) ? 0.6 : ((grade == 2) ? 0.3 : ((grade == 3) ? 0.1 : 0)))
		return ((grade == 1) ? prizeMoney * 0.6 : ((grade == 2) ? prizeMoney * 0.3 : ((grade == 3) ? prizeMoney * 0.1 : 0)));
	}
}