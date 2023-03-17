package com.kbstar.test;


import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();
		
		                  //id, user_id, item_id, cnt
		Cart cart = new Cart("2023314634100","id88", "300", 10);
		try {
			crudService.modify(cart);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}


