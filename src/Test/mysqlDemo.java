package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class mysqlDemo {
	@Test
	public void select(){
		// TODO Auto-generated method stub
		String user = "root";
		String password = "gwunited!234";
		String url = "jdbc:mysql://121.42.150.229:3306/youming_dbs?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useUnicode=true&characterEncoding=utf8";
		String driver = "com.mysql.jdbc.Driver";
		String sqlstr;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();        
			sqlstr = "select id from user where id not in (select friend_id from user_friend where user_id = 1010 ) and id != 1010";
			rs = stmt.executeQuery(sqlstr);
			while(rs.next()) {
				int id = rs.getInt(1);
				System.out.println("Name :" + id);
			}
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void add(){
		// TODO Auto-generated method stub
		String user = "root";
		String password = "gwunited!234";
		String url = "jdbc:mysql://121.42.150.229:3306/youming_dbs?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useUnicode=true&characterEncoding=utf8";
		String driver = "com.mysql.jdbc.Driver";
		Connection con = null;
		Statement stmt = null;
		String s = null;
		
		String sqlstr;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			stmt = con.createStatement();
			sqlstr = "select id from user where id not in (select friend_id from user_friend where user_id = 1010 ) and id != 1010";
			rs = stmt.executeQuery(sqlstr);
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO `youming_dbs`.`user_friend` (`id`, `user_id`, `friend_id`, `relation_info_datas`, `source_datas`, `is_favorite`, `create_date`, `update_time`) VALUES (null, '1010', ?, '{}', '{\"type\":3,\"date\":1424014852751,\"content\":\"2\"}', '0', '2015-02-15 23:40:52', '2015-02-15 23:40:52');");
			long a = System.currentTimeMillis();
			System.out.println("start:"+a);
			while(rs.next()) {
				int friend_id = rs.getInt(1);
				System.out.println("friend_id :" + friend_id);
				pst.setInt(1, friend_id);
				pst.addBatch();
			}
			pst.executeBatch();
			con.commit();
			stmt.close();
			con.close();
			System.out.println("end:"+(System.currentTimeMillis()-a));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
