package com.kbstar.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

	public CartDaoImpl() {
		// Driver Loading
		// Class.forName("oracle.jdbc.OracleDriver");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
	}

	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUser_id());
			pstmt.setString(3, v.getItem_id());
			pstmt.setInt(4, v.getCnt());
			int result = pstmt.executeUpdate(); // 위에서 만든 쿼리문을 업데이트한다.
			//System.out.println(result);

		} catch (SQLException e) {
			throw e;
			//e.printStackTrace();
			//insert 하다가 문제가 발생하면 던져야 확인가능. 던지지 않으면 App에서는 장애 여부 확인 불가
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartDeleteSql);){
			pstmt.setString(1, k);
			
			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
			//System.out.println(result);
			//해당사항없으면 0으로 나옴
			if (result == 0) {
				throw new Exception("ID없음");
			}
		} catch (SQLException e) {
			throw e;
		}

	}

	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartUpdateSql);){
			
			pstmt.setString(1, v.getUser_id());
			pstmt.setString(2, v.getItem_id());
			pstmt.setInt(3, v.getCnt());
			pstmt.setString(4, v.getId());
			
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("없음");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql)){
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String id = rset.getString("id"); //id: 생성하는 테이블의 컬럼
				String user_id = rset.getString("user_id");
				String item_id = rset.getString("item_id");
				int cnt = rset.getInt("cnt");
				Date regdate = rset.getDate("regdate");
				cart = new Cart(id, user_id, item_id, cnt, regdate);
			}catch(Exception e){
				throw e; //바깥 try/catch로 던지기
				//e.printStackTrace();
			}
		}catch(Exception e) {
			throw new Exception(); // = throw e;
			//e.printStackTrace();
		}
		return cart;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		List<Cart> list = new ArrayList<Cart>();
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectAllSql);) {
			
			try(ResultSet rset = pstmt.executeQuery()){
				while(rset.next()) {
					Cart cart = null;
					String db_id = rset.getString("id");
					String db_user_id = rset.getString("user_id");
					String db_item_id = rset.getString("item_id");
					int cnt = rset.getInt("cnt");
					Date regdate = rset.getDate("regdate");
					cart = new Cart(db_id, db_user_id, db_item_id, cnt, regdate);
					list.add(cart);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			if(list.size() == 0) {
				throw new Exception("없음");
			}
		} catch (Exception e) {
			throw e;
		} 
		return list;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}


