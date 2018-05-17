
public class carrinhoCompra {

	private static carrinhoCompra instanciaCarrinho;
	
	public carrinhoCompra getInstance() {
		if(instanciaCarrinho == null) {
			instanciaCarrinho= new carrinhoCompra();
			System.out.println("Criado a instância pela primeira vez...");
		}else {
			System.out.println("Uma instância já foi criada...");
		}
		return instanciaCarrinho;
	}
}
