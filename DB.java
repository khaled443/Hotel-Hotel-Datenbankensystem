

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			con=DriverManager.getConnection("jdbc:postgresql://db.f4.htw-berlin.de:5432/_s0556290__hotel", "s0556290", "Sandra#2700");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
