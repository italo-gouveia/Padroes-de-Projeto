import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection
				("jdbc:mysql://localhost:3308/conexaobanco?useSSL=false", "root", "");
	}
}