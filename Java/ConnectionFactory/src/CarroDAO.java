import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;

public class CarroDAO implements IDAOGenerico{
	private String insertUrl = "insert into concecionaria(modelo, fabricante, ano, preco, chassi) values(?,?,?,?,?)";
	
	@Override
	public void inserir(Object o) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try (Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into concecionaria(modelo, fabricante, ano, preco, chassi) values(?,?,?,?,?)");
			Carro c = (Carro) o;
			ps.setString(1, c.getModelo());
			ps.setString(2, c.getFabricante());
			ps.setInt(3, c.getAno());
			ps.setFloat(4, c.getPreco());
			ps.setInt(5, c.getChassi());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
