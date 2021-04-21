package project.backend;
import java.sql.*;
public class ConnectionManager
{
	Connection con;
	public Connection makeConnection()
	{
			try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
			con=DriverManager.getConnection("jdbc:odbc:Student1","sa","password");
			}catch(ClassNotFoundException clfne){System.out.println(clfne);}
			catch(SQLException sqle){System.out.println(sqle);}
		return con;
	}
}
