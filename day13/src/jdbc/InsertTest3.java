package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest3 {

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
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";  //이 SQL문을 질의하겠다
		
		//Statement 생성 - SQL
		//SQL 전송
		
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(insertSql);){
			pstmt.setString(1, "id20");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "김말자");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate(); //위에서 만든 쿼리문을 업데이트한다.
			System.out.println(result);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		//결과받기
		
		
	}

}
