package projeto_APII;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static Scanner scam = new Scanner(System.in);

	public static void main(String[] args) {
		int op = 0; // Varialvel para a maioria das opçoes
		boolean continuar = true; // variavel para o loop de todo o menu

		ArrayList<Jogo> Colecao = new ArrayList<Jogo>(); // Definição do ArrayList
		Colecao.add(new Jogo("Elden ring", 2022, "RPG", "FromSoftware", 1001, 96, 230.90)); // método para adicionar elementos no ArrayList
		Colecao.add(new Jogo("Red Dead Redeption 2", 2019, "Mundo Aberto", "Rockstar", 1002, 97, 299.90));
		Colecao.add(new Jogo("God of War", 2018, "RPG", "Santa Monica Studio", 1003, 94, 199.90));
		Colecao.add(new Jogo("Borderlands 3", 2019, "Shooter", "Gearbox", 1004, 81, 119.90));
		Colecao.add(new Jogo("Call of Duty: Black Ops III", 2015, "Shooter", "Treyarch", 1005, 81, 274));
		Colecao.add(new Jogo("Far Cry 5", 2018, "Ação", "Ubisoft", 1006, 81, 179.99));
		Colecao.add(new Jogo("EA Sports FC 25", 2024, "Esporte", "Electronic Arts", 1007, 76, 299));
		Colecao.add(new Jogo("Overwatch 2", 2022, "FPS", "Blizzard Entertainment", 1008, 79, 0));
		Colecao.add(new Jogo("Grand Theft Auto V", 2013, "Mundo Aberto", "Rockstar", 1009, 97, 90.99));
		Colecao.add(new Jogo("Diablo IV", 2023, "RPG", "Blizzard Entertainment", 1010, 86, 229.90));

		do {

			System.out.println("Coleçao de jogos\n");
			System.out.println("1. Mostrar todos os Jogos");
			System.out.println("2. Inserir Jogo");
			System.out.println("3. Consulte um Jogo");
			System.out.println("4. Exclua um Jogo");
			System.out.println("5. Altere dados de um Jogo");
			System.out.println("6. Relatorios de Jogos");
			System.out.println("7. Sair");

			op = Biblioteca.ValidarInt(1, 7);

			switch (op) { // menu principal
			case 1:
				for (int i = 0; i < Colecao.size(); i++) {
					Colecao.get(i).imprimirJogo();
				}
				break;
			case 2: {
				do {

					Colecao.add(Jogo.inserirJogo());
					System.out.println("Deseja inserir outro jogo?");
					System.out.println("1. para Sim");
					System.out.println("2. para Não");
					op = Biblioteca.ValidarInt(1, 2);

				} while (op == 1);

				break;
			}

			case 3:
				
				Menus.menuconsulta(Colecao);
				
				break; 
				

			case 4: // remover jogo
				
				System.out.println("Digite o nuemro de serie do jogo desejado");
				int buscarI = Biblioteca.ValidarInt2();
				for (int i = 0; i < Colecao.size(); i++) {
					if (Colecao.get(i).numserie == buscarI) {
						Colecao.remove(i);
						System.out.println("Jogo Removido");
					}
				}
				for (int i = 0; i < Colecao.size(); i++) {
					Colecao.get(i).imprimirJogo();
				}
				
				break;

			case 5: // alterar dados
				
				System.out.println("Digite o nuemro de serie do jogo desejado");
				buscarI = Biblioteca.ValidarInt2();
				for (int i = 0; i < Colecao.size(); i++) {
					if (Colecao.get(i).numserie == buscarI) {
						Colecao.set(i, Jogo.inserirJogo());
					}
				}
				for (int i = 0; i < Colecao.size(); i++) {
					Colecao.get(i).imprimirJogo();
				}
				
				break;

			case 6: // menu de relatorios
				
				Menus.menuRelatorios(Colecao);
				
				break;

			case 7:
				
				System.out.println("Programa Encerrado");
				continuar = false;
				
				break;
				
			default:
				
				System.out.println("Opção Invalida, Digite novamente");
				
				break;
			}

		} while (continuar);

	}

}
