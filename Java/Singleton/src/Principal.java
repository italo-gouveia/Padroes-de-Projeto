
public class Principal {
	public static void main(String[] args) {
		
	
	System.out.println("Primeira chamada...");
	carrinhoCompra meuCarrinho = new carrinhoCompra();
	meuCarrinho.getInstance();
	
	System.out.println("Segunda chamada...");
	carrinhoCompra meuCarrinho2 = new carrinhoCompra();
	meuCarrinho2.getInstance();
	}
}
