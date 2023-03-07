package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ShopDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.ShopService;

public class AppShop {

	public static void main(String[] args) {
		Service<String,ShopDTO> service = new ShopService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("ID를 설정해주세요 ...");
				String id = sc.next();
				System.out.println("브랜치 명을 입력해주세요");
				String name = sc.next();
				System.out.println("브랜치 위치를 입력해주세요 ...");
				String location = sc.next();
				ShopDTO shop = new ShopDTO(id, name, location);
				service.register(shop);
			}else if(cmd.equals("d")) {
				System.out.println("ID를 입력해주세요 ...");
				String id = sc.next();
				service.remove(id);
			}else if(cmd.equals("u")) {
				System.out.println("ID를 입력해주세요 ...");
				String id = sc.next();
				System.out.println("브랜치 명을 입력해주세요 ...");
				String name = sc.next();
				System.out.println("브랜치 위치를 입력해주세요 ...");
				String location = sc.next();
				ShopDTO shop = new ShopDTO(id, name, location);
				service.modify(shop);
			}
		}
		sc.close();
	}

}
