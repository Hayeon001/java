package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() {
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

	// getConnection 불러서 사용하면 됨
//	public Connection getConnection() throws Exception {
//		Connection con = null;		
//		String id = "bank"; //workspace
//		String pwd = "111111";
//		String url = "jdbc:oracle:thin:@172.16.21.58:1521:XE";
//		con = DriverManager.getConnection(url, id, pwd);
//		return con;

	public Connection getConnection() throws Exception {
		Connection con = null;

		// 소스가 달라져도 수정 가능하도록 만드는 방법 : properties
		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;

	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate(); // 위에서 만든 쿼리문을 업데이트한다.
			//System.out.println(result);

		} catch (SQLException e1) {
			throw e1;
			//e1.printStackTrace();
			//insert 하다가 문제가 발생하면 던져야 확인가능. 던지지 않으면 App에서는 장애 여부 확인 불가
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);){
			pstmt.setString(1, k);
			
			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
			//System.out.println(result);
			//해당사항없으면 0으로 나옴
			if (result == 0) {
				throw new Exception("ID없음");
			}
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);){
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			
			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
			if(result == 0) {
				throw new Exception("없음");
			}
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql)){
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String id = rset.getString("id"); //id: 생성하는 테이블의 컬럼
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);
			}catch(Exception e){
				throw e; //바깥 try/catch로 던지기
				//e.printStackTrace();
			}
		}catch(Exception e) {
			throw new Exception(); // = throw e;
			//e.printStackTrace();
		}
		return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<Cust>();
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			
			try(ResultSet rset = pstmt.executeQuery()){
				while(rset.next()) {
					Cust cust = null;
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(db_id, db_pwd, name, age);
					list.add(cust);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			if(list.size() == 0) {
				throw new Exception("없음");
			}
		} catch (Exception e1) {
			throw e1;
		} 
		
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}



//@Override
//public List<Cust> selectAll() throws Exception {
//	List<Cust> list = new ArrayList<Cust>();
//	try(Connection con = getConnection(); 
//			PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
//		
//		try(ResultSet rset = pstmt.executeQuery()){
//			while(rset.next()) {
//				Cust cust = null;
//				String id = rset.getString("id");
//				String pwd = rset.getString("pwd");
//				String name = rset.getString("name");
//				int age = rset.getInt("age");
//				cust = new Cust(id, pwd, name, age);
//				list.add(cust);
//			}
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		if(list.size() == 0) {
//			throw new Exception("없음");
//		}
//	} catch (Exception e1) {
//		throw e1;
//	} 
//	
//	return list;
//}
