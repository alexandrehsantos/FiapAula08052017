package br.com.fiap;

public class Cliente {
	private String numeroRG;
	private String numeroCPF;
	private String endereco;
	private String nome;
	int inc;
	
	public Cliente() {
		super();
		this.step();
	}

	public Cliente(String numeroRG) {
		this();
		this.numeroRG = numeroRG;
		this.step();
	}

	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		this(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
		this.step();
	}

	private void step() {
		inc++;
		System.out.println(inc);
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente("32434746", "3333333333", "asdfasdfasf", "xxxxxx");
	}

}
