
public class carrinhoCompra {

	private static carrinhoCompra instanciaCarrinho;
	
	public carrinhoCompra getInstance() {
		if(instanciaCarrinho == null) {
			instanciaCarrinho= new carrinhoCompra();
			System.out.println("Criado a inst�ncia pela primeira vez...");
		}else {
			System.out.println("Uma inst�ncia j� foi criada...");
		}
		return instanciaCarrinho;
	}
}
