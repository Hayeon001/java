package com.kbstar.app;

import java.util.Scanner;


import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.AdminService;

public class AppAdmin {

	public static void main(String[] args) {
			Service<String, AdminDTO> service = new AdminService();
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("Input command(q,i,d,u)");
				String cmd = sc.next();
				if (cmd.equals("q")) {
					System.out.println("Bye");
					break;
				}else if ( cmd.equals("i")) {
					System.out.println("Input ID...");
					String id = sc.next();
					System.out.println("Input PWD...");
					String pwd = sc.next();
					System.out.println("Input LEVEL...(L1,L2)");
					String level = sc.next();
					AdminDTO Admin = new AdminDTO(id, pwd, level);
					service.register(Admin);
					
				}else if ( cmd.equals("d")) {
					System.out.println("Input ID...");
					String id = sc.next();
					service.remove(id);
							
				}else if ( cmd.equals("u")) {
					System.out.println("Input ID...");
					String id = sc.next();
					System.out.println("Input PWD...");
					String pwd = sc.next();
					System.out.println("Input NAME...");
					String level = sc.next();
					AdminDTO Admin = new AdminDTO(id, pwd, level);
					service.modify(Admin);
						
				}
			}
			sc.close();
	}
}

