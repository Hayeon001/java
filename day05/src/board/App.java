package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		while (true) {
			System.out.println("input cmd(r,u,d,g,q)");
			String cmd = sc.next();
			if (cmd.equals("q")) { // 끝내기q
				System.out.println("Bye.");
				break;
			} else if (cmd.equals("r")) { // 등록r
				System.out.println("Input comtents");
				String content = sc.next();
				service.register(content);

			} else if (cmd.equals("g")) { // 가져오기g
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);
			} else if (cmd.equals("d")) { // 삭제하기 d
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				service.remove(num);
			} else if (cmd.equals("u")) { // 수정하기u
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);
			}
		}
		sc.close();
	}

}
