package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();
		
		Cart cart = new Cart("id04", "100", 3);  //user_id, item_id, cnt
		try {
			crudService.register(cart);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
