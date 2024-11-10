package projeto_APII;

import java.util.Scanner;

public class Jogo {
	
	static Scanner scam = new Scanner(System.in);

	

	int numserie, anoLancamento;
	String nome, genero, desenvolvedor;
	double nota, preco;

	public Jogo(String nome, int anoLancamento, String genero, String desenvolvedor, int numserie, double nota, double preco) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.desenvolvedor = desenvolvedor;
		this.numserie = numserie;
		this.nota = nota;
		this.preco = preco;
	}

	void imprimirJogo() {
		System.out.println("");
		System.out.println(nome + "\nAno de Lançamento: " + anoLancamento + "\nGenero: " + genero + "\nDesenvolvedor: "
				+ desenvolvedor + "\nNumero de serie: " + numserie);
		System.out.printf("Nota MetaCrit %.2f\nMelhor Preço %.2f\n", nota,preco);
		System.out.println("");
	}

	static Jogo inserirJogo() {
		
		System.out.println("Insira o nome do jogo");
		String nome=scam.nextLine();
		System.out.println("Insira o Ano de Lançamento do jogo");
		int anoLancamento= Biblioteca.ValidarInt(1958,2024);
		System.out.println("Insira o Genero do jogo");
		String genero=scam.nextLine();
		System.out.println("Insira o Desenvolvedor do jogo");
		String desenvolvedor=scam.nextLine();
		System.out.println("Insira o Numero de Serie do jogo");
		int numserie= Biblioteca.ValidarInt2();
		System.out.println("Insira a Nota do jogo");
		double nota= Biblioteca.ValidarDouble(0,100);
		System.out.println("Insira o Preço do jogo");
		double preco= Biblioteca.ValidarDouble(0,Double.MAX_VALUE);
		
		return new Jogo(nome, anoLancamento, genero, desenvolvedor, numserie, nota,preco);
		
	}

}
