package pracproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/oopspro(1)",
			       "postgres", "sruthisubha23");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
