package Queue;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_2_Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		int op;
		String livro, removerLivro;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n++++++++++++++++++++++++++++++");
			System.out.println("\n1- Adicionar Livro na Pilha");
			System.out.println("\n2- Listar todos os Livros");
			System.out.println("\n3- Retirar Livro da pilha");
			System.out.println("\n0- Sair");
			System.out.println("\n++++++++++++++++++++++++++++++");

			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();

			switch (op) {

			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				livro = leia.nextLine();
				pilha.add(livro);

				System.out.println(pilha);
				System.out.printf("\nLivro %S adicionado!", livro);
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de Livros na Pilha: " + pilha);
				break;

			case 3:
				leia.nextLine();

				if (pilha.isEmpty()) {
					System.out.println("A estante está vazia!!");
				} else {
					System.out.println("Qual livro deseja retirar da estante?");
					removerLivro = leia.nextLine();
					pilha.contains(removerLivro);
					pilha.remove(removerLivro);
					System.out.printf("\nLivro %S removido!\n", removerLivro);
				}
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("Opção inválida!!!");
			}

		} while (op != 0);

	}

}
