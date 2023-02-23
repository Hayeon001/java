package variable;

import java.util.Scanner;

public class P82 {

	public static void main(String[] args) {
		int score = 79;
		
		/*String grade = "";
		if(score>=90) {
			grade = "A";
		} else if{score>=80){
			grade = "B";
		} else {
			grade = "F";
		} ...*/
		
		String grade = (score>=90) ? "A": (score>=80) ? "B" : "F";
		System.out.println(grade);
		
	}
}
