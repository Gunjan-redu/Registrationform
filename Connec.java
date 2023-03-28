package registrationform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connec {
	
	Connection c;
	Statement s;
	
	public Connec() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c = DriverManager.getConnection("jdbc:mysql:///form", "root", "Gunjan@123");
				s = (Statement) c.createStatement();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		
		
	}
	
}
