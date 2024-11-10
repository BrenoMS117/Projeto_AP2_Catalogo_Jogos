package projeto_APII;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	

	static boolean encontrado = false; // variavel para encontrar atributos
	static Scanner scam = new Scanner(System.in);

	// Método para ler e validar uma entrada de inteiro com intervalo
	public static int ValidarInt(int min, int max) {
		int valor = 0;
		boolean entradaValida = false;

		while (!entradaValida) {

			if (scam.hasNextInt()) {
				valor = scam.nextInt();
				scam.nextLine();

				if (valor >= min && valor <= max) {
					entradaValida = true;
				} else {
					System.out.println("Digite um valor entre " + min + " e " + max + ".");
				}
			} else {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				scam.nextLine();
			}
		}
		return valor;
	}

	// Método para ler e validar uma entrada de inteiro sem intervalo
	public static int ValidarInt2() {
		int valor = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			if (scam.hasNextInt()) {
				valor = scam.nextInt();
				scam.nextLine();
				entradaValida = true;
			} else {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				scam.nextLine();
			}
		}
		return valor;
	}

	// Método para ler e validar uma entrada de double
	public static double ValidarDouble(double min, double max) {
		double valor = 0.0;
		boolean entradaValida = false;

		while (!entradaValida) {

			if (scam.hasNextDouble()) {
				valor = scam.nextDouble();

				if (valor >= min && valor <= max) {
					entradaValida = true;
				} else {
					System.out.println("Digite um valor entre " + min + " e " + max + ".");
				}
			} else {
				System.out.println("Entrada inválida. Digite um número Decimal.");
				scam.nextLine();
			}
		}
		return valor;
	}

	static void buscarNome(ArrayList<Jogo> Colecao, String buscarS) { // metodo para buscar nomes
		for (Jogo jogo : Colecao) {
			if (jogo.nome.equalsIgnoreCase(buscarS)) {
				System.out.println("O nome " + buscarS + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O nome " + buscarS + " não foi encontrado.");

		}

	}

	static void buscarAnoL(ArrayList<Jogo> Colecao, int buscarI) { // metodo para buscar Ano de Lançamento
		for (Jogo jogo : Colecao) {
			if (jogo.anoLancamento == buscarI) {
				System.out.println("O Ano de Lançamento " + buscarI + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O Ano de Lançamento " + buscarI + " não foi encontrado.");
		}

	}

	static void buscarGenero(ArrayList<Jogo> Colecao, String buscarS) { // metodo para buscar Genero

		for (Jogo jogo : Colecao) {
			if (jogo.genero.equalsIgnoreCase(buscarS)) {
				System.out.println("O Genero " + buscarS + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O Genero " + buscarS + " não foi encontrado.");
		}

	}

	static void buscarDesenvolvedor(ArrayList<Jogo> Colecao, String buscarS) { // metodo para buscar Desenvolvedor

		for (Jogo jogo : Colecao) {
			if (jogo.desenvolvedor.equalsIgnoreCase(buscarS)) {
				System.out.println("O Desenvolvedor " + buscarS + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O Desenvolvedor " + buscarS + " não foi encontrado.");
		}

	}

	static void buscarNumSerie(ArrayList<Jogo> Colecao, int buscarI) { // metodo para buscar Numero de Serie

		for (Jogo jogo : Colecao) {
			if (jogo.numserie == buscarI) {
				System.out.println("O Numero de Serie " + buscarI + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O Numero de Serie " + buscarI + " não foi encontrado.");
		}

	}

	static void buscarNota(ArrayList<Jogo> Colecao, Double buscarD) { // metodo para buscar Notas

		for (Jogo jogo : Colecao) {
			if (jogo.nota == buscarD) {
				System.out.println("A Nota " + buscarD + " foi encontrada.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("A Nota " + buscarD + " não foi encontrada.");
		}

	}

	static void buscarPreco(ArrayList<Jogo> Colecao, Double buscarD) { // metodo para buscar Preço

		for (Jogo jogo : Colecao) {
			if (jogo.preco == buscarD) {
				System.out.println("O preço " + buscarD + " foi encontrado.");
				encontrado = true;
				System.out.println();
				jogo.imprimirJogo();

			}
		}
		if (!encontrado) {
			System.out.println("O preço " + buscarD + " não foi encontrado.");
		}
	}
	
}