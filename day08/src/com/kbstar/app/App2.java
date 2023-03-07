package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class App2 {
	//App에서는 service가 필요
	public static void main(String[] args) {
		Service<Integer,ItemDTO> service = new ItemService();
		SearchService search = new ItemService();
		//ItemService service = new ItemService(); //search를 추가하려면 경로 바꿔줘야함
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u,s");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("s")) {
				search.search();
				
			}else if(cmd.equals("i")) {
				System.out.println("Input ID ...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME ...");
				String name = sc.next();
				System.out.println("Input PRICE ...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input ID ...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.register(item);
				
			}else if(cmd.equals("d")) {
				System.out.println("Input ID ...");
				int id = Integer.parseInt(sc.next()); //숫자이외 값이 들어왔을 떄 숫자로 바꿀 수 없어 오류발생
				//코드상으로는 문제없음.정상적으로 숫자ID를 넣으면 잘 작동.
				//Exception 예외상황 : 숫자이외 id를 넣어 생긴 오류
				service.remove(id);
				
				/*
				try{
					int id = Integer.parseInt(sc.next()); //문제가 발생하면 catch로 넘어감 
					service.remove(id);
				}catch(Exception e){
					System.out.println("잘못 입력하셨습니다. 숫자로 입력해주세요.");
				}
				*/
				
			}else if(cmd.equals("u")) {
				System.out.println("Input ID ...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME ...");
				String name = sc.next();
				System.out.println("Input PRICE ...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input ID ...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.modify(item);
			}
		}
		sc.close();
	}
	

}
