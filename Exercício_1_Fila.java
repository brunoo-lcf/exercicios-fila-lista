package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercício_1_Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int op;
		String nome;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n++++++++++++++++++++++++++++++");
			System.out.println("\n1- Adicionar Cliente na Fila");
			System.out.println("\n2- Listar todos os  Clientes");
			System.out.println("\n3- Retirar Cliente da Fila");
			System.out.println("\n0- Sair");
			System.out.println("\n++++++++++++++++++++++++++++++");

			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();

			switch (op) {

			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);

				System.out.println(fila);
				System.out.println("\nCliente adicionado a fila!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de clientes na fila: " + fila);
				break;

			case 3:
				leia.nextLine();

				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");

				} else {
					fila.remove();
					System.out.println("Fila:"+fila);
					System.out.println("\nO cliente foi chamado!");
				}
				break;
				
			case 0: 
				System.out.println("\nPrograma Finalizado!");
				break;
			
			default :
				System.out.println("Opção inválida!!!");
			}

		} while (op != 0);
	}

}
