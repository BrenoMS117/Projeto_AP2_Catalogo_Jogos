package projeto_APII;

import java.util.Scanner;
import java.util.ArrayList;

public class Menus {

	static boolean continuar = true;
	static Scanner scam = new Scanner(System.in);

	static void menuconsulta(ArrayList<Jogo>Colecao) { // menu de consulta de dados
		
		String buscarS; // variavel para especificar a busca de String
		int buscarI; // de Int
		double buscarD; // de Double
		while (continuar) {
			int op1;

			System.out.println("escolha o tipo de atributo a ser consultado");
			System.out.println("1 para consultar por nome");
			System.out.println("2 para consultar por Ano de Lançamento");
			System.out.println("3 para consultar por Genero");
			System.out.println("4 para consultar por Desenvolvedor");
			System.out.println("5 para consultar por Numero de Serie");
			System.out.println("6 para consultar por Nota");
			System.out.println("7 para consultar por Preço");
			System.out.println("8 para voltar para menu Principal");
			op1 = Biblioteca.ValidarInt(1, 8);

			switch (op1) { // menu para consultas

			case 1: // consultar nome

				System.out.println("Digite o Nome");
				buscarS = scam.nextLine();
				Biblioteca.buscarNome(Colecao, buscarS);

				break;

			case 2: // consultar Ano de Lançamento

				System.out.println("Digite o Ano de Lançamento");
				buscarI = Biblioteca.ValidarInt2();
				Biblioteca.buscarAnoL(Colecao, buscarI);

				break;

			case 3: // consultar genero

				System.out.println("Digite o Genero");
				buscarS = scam.nextLine();
				Biblioteca.buscarGenero(Colecao, buscarS);

				break;

			case 4: // consultar desenvolvedor

				System.out.println("Digite o Desenvolvedor");
				buscarS = scam.nextLine();
				Biblioteca.buscarDesenvolvedor(Colecao, buscarS);

				break;

			case 5: // consultar numero de serie

				System.out.println("Digite o Numero de Serie");
				buscarI = Biblioteca.ValidarInt2();
				Biblioteca.buscarNumSerie(Colecao, buscarI);

				break;

			case 6: // consultar nota

				System.out.println("Digite a Nota");
				buscarD = Biblioteca.ValidarDouble(0, 100);
				Biblioteca.buscarNota(Colecao, buscarD);

				break;

			case 7: // consultar preço

				System.out.println("Digite o Preço");
				buscarD = Biblioteca.ValidarDouble(0, Double.MAX_VALUE);
				Biblioteca.buscarPreco(Colecao, buscarD);

				break;

			case 8:

				continuar = false;

				break;

			default:

				System.out.println("Opção Invalida, Digite novamente");

				break;

			}

			break; // fim do menu de consultas
		}
	}

	static void menuRelatorios(ArrayList<Jogo>Colecao) { // menu de relatorios
		
		while(continuar) {
		System.out.println("escolha o Relatorio desejado");
		System.out.println("1 para Jogos com as maiores notas");
		System.out.println("2 para Jogos mais recentes");
		System.out.println("3 para Jogos mais caros");
		System.out.println("4 para Jogos mais Baratos");
		System.out.println("5 para voltar para menu Principal");
		
		int op = Biblioteca.ValidarInt(1, 5);

		switch (op) {

		case 1:
			// Encontrar jogos com as maiores notas
			double maiorNota = 0;
			for (Jogo jogo : Colecao) {
				if (jogo.nota > maiorNota) {
					maiorNota = jogo.nota;
				}
			}
			System.out.println("Jogos com a maior nota (" + maiorNota + "):");
			for (Jogo jogo : Colecao) {
				if (jogo.nota == maiorNota) {
					jogo.imprimirJogo();
				}
			}

			break;

		case 2:

			// Encontrar Jogos mais recentes
			int maiorAno = 0;
			for (Jogo jogo : Colecao) {
				if (jogo.anoLancamento > maiorAno) {
					maiorAno = jogo.anoLancamento;
				}
			}
			System.out.println("Jogo mais recente Ano: (" + maiorAno + ")");
			for (Jogo jogo : Colecao) {
				if (jogo.anoLancamento == maiorAno) {
					jogo.imprimirJogo();
				}
			}

			break;

		case 3:

			// Encontrar jogos mais caros
			double maiorPreco = 0;
			for (Jogo jogo : Colecao) {
				if (jogo.preco > maiorPreco) {
					maiorPreco = jogo.preco;
				}
			}
			System.out.println("Jogo mais caro (" + maiorPreco + ")");
			for (Jogo jogo : Colecao) {
				if (jogo.preco == maiorPreco) {
					jogo.imprimirJogo();
				}
			}

			break;

		case 4:

			// Encontrar jogos mais Baratos
			double menorPreco = Double.MAX_VALUE;
			for (Jogo jogo : Colecao) {
				if (jogo.preco < menorPreco) {
					menorPreco = jogo.preco;
				}
			}
			System.out.printf("Jogo mais Barato ( %.2f )\n", menorPreco);
			for (Jogo jogo : Colecao) {
				if (jogo.preco == menorPreco) {
					jogo.imprimirJogo();
				}
			}

			break;
			
		case 5:
			
			continuar = false;
			
			break;

		default:

			System.out.println("Opção Invalida, Digite novamente");

			break;
		}
	}
		
	}
}
