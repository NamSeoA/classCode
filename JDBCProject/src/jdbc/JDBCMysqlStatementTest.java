package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMysqlStatementTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Load !!!");
			
			// 2. DB ����     localhost == 127.0.0.1
			String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			String user = "bit";
			String password = "bit";
			
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			
			// 3. Statement �ν��Ͻ� ����s
			Statement stmt = conn.createStatement();
			
			System.out.println("�μ��̸��� �Է����ּ���.");
			String userDname = sc.nextLine();
			System.out.println("�μ��� ��ġ�� �Է����ּ���.");
			String userLoc = sc.nextLine();
			
			// �Է� : insert 
			String slqInsert = "insert into dept(deptno, dname, loc) values (80, '"+userDname+"', '"+userLoc+"')";
			
			int resultCnt = stmt.executeUpdate(slqInsert);
			
			if(resultCnt>0) {
				System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�.");
			}
			
			
			// 4. Sql ���� : �μ�����Ʈ ���
			String sql = "select * from dept order by deptno";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5. ResultSet �� �̿��ؼ� ��� ���
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3);
				
			//	System.out.println(deptno+"\t"+dname+"\t"+loc);
				System.out.printf("%5s", deptno+"\t");
				System.out.printf("%12s", dname+"\t");
				System.out.printf("%12s", loc+"\n");
			}
			
			
			
			
			// 6. close
			rs.close();
			stmt.close();
			conn.close();
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver �ε� ����");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		 
		
		
		
	}

}