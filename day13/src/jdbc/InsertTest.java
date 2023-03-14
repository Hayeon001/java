package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		// 263p
		
		//Driver Loading
		//Class.forName("oracle.jdbc.OracleDriver");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
		
		
		//Connect
		//1521, 8080
		String id = "bank"; //workspace
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.58:1521:XE";
		Connection con = null;
		PreparedStatement pstmt = null; 
		
		//con = DriverManager.getConnection(url, id, pwd);
//		try {
//			con = DriverManager.getConnection(url, id, pwd);
//			
//		} catch (SQLException e) {
//			System.out.println("접속실패!!");
//			e.printStackTrace();
//			return;
//		}
//		System.out.println("접속성공!!");
		
		
		//Statement 생성 - SQL
		//SQL 전송
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";  //이 SQL문을 질의하겠다
		//프로그램에 요청할땐 ; 안찍음  //물음표에 하나씩 넣어 질의한다
		
		//1. PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		//2.try {
		//			PreparedStatement pstmt = con.prepareStatement(insertSql);
		//		} catch (SQLException e1) {
		//			e1.printStackTrace();
		//		}
		//3.빼주기
		//		PreparedStatement pstmt = null;
		//		try {
		//			pstmt = con.prepareStatement(insertSql);
		//			pstmt.setString(1, "id24");
		//			pstmt.setString(2, "pwd10");
		//			pstmt.setString(3, "홍길동");
		//			pstmt.setInt(4, 50);
		//			pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
		//		} catch (SQLException e1) {
		//			e1.printStackTrace();
		//		}
		//4.
		//		PreparedStatement pstmt = null;
		//		try {
		//			pstmt = con.prepareStatement(insertSql);
		//			pstmt.setString(1, "id10");
		//			pstmt.setString(2, "pwd10");
		//			pstmt.setString(3, "홍길동");
		//			pstmt.setInt(4, 50);
		//			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
		//			System.out.println(result);
		//			pstmt.close(); 
		//		} catch (SQLException e1) {
		//			e1.printStackTrace();
		//		} 
		
		//PreparedStatement pstmt = null;  //위로 올라감 31
		try {
			con = DriverManager.getConnection(url, id, pwd);   //위에 따로 안넣고 옮겨옴
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id20");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "김말자");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
			System.out.println(result);
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			//pstmt.close();
			try {
				if(pstmt != null) {
				pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) {
				con.close();
				}
			} catch (SQLException e) {
				System.out.println("close 실패!!");
				e.printStackTrace();
			}
			System.out.println("close 성공!!");
		}
		
		//결과받기
		
		
		//close //꼭 닫아주기!!
		//finally 밑으로 들어감
//		try {
//			if(pstmt != null) {
//			con.close();
//			}
//		} catch (SQLException e) {
//			System.out.println("close 실패!!");
//			e.printStackTrace();
//		}
//		System.out.println("close 성공!!");
	}

}
