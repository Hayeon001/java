package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class AppItem {

	public static void main(String[] args) {
		Service<String, ItemDTO> service = new ItemService(); 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ITEM ID...");
				String id = sc.next();
				System.out.println("Input ITEM NAME...");
				String name = sc.next();
				System.out.println("Input ITEM PRICE...");
				String price = sc.next();
			
				ItemDTO user = new ItemDTO(id, name, price);
				service.register(user);
			} else if (cmd.equals("d")) {
			
				System.out.println("Input ITEM ID...");
				String id = sc.next();
				service.remove(id);
			} else if (cmd.equals("u")) {
				
				System.out.println("Input ITEM ID...");
				String id = sc.next();
				System.out.println("Input ITEM NAME...");
				String name = sc.next();
				System.out.println("Input ITEM PRICE...");
				String price = sc.next();
				ItemDTO item = new ItemDTO(id, name, price);
				service.modify(item);
			}
		}
		sc.close();

	}

}
