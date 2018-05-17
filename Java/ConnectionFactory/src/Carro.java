
public class Carro {

	private String modelo;
	private String fabricante;
	private int ano;
	private float preco;
	private int chassi;
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public Carro(String modelo, String fabricante, int ano, float preco, int chassi) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.preco = preco;
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
}
