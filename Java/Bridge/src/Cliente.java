
public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
	}

}
