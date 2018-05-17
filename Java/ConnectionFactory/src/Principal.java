
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroDAO cDao = new CarroDAO();
		
		Carro c = new Carro("Civic","Honda", 2018, 120000, 21212);
		
		try {
			cDao.inserir(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
