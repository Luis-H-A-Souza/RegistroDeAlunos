package executable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaDeAlunos lda = new ListaDeAlunos();
		boolean codigo = true;

		while (codigo == true) {
			String nome;
			System.out.println("\n=== Registro de Alunos ===\n");
			System.out.println("1 - Adicionar no Início");
			System.out.println("2 - Adicionar no Final");
			System.out.println("3 - Remover do Início");
			System.out.println("4 - Remover do Final");
			System.out.println("5 - Imprimir Lista");
			System.out.println("0 - Encerrar programa");
			System.out.print("\nEscolha o que deseja fazer: ");
			int escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
			case 1:
				System.out.print("\nInforme o nome do Aluno: ");
				nome = sc.nextLine();
				lda.addListaInicio(nome);
				break;

			case 2:
				System.out.print("\nInforme o nome do Aluno: ");
				nome = sc.nextLine();
				lda.addListaFim(nome);
				break;

			case 3:
				System.out.println(lda.removerListaInicio());

				break;

			case 4:
				System.out.println(lda.removerListaFim());
				break;

			case 5:
				lda.exibirLista();
				break;

			case 0:
				System.out.println("\nEncerrando Programa...");
				codigo = false;
				break;

			default:
				System.out.println("\nInforme um código válido!");
			}

			if (codigo != false) {
				System.out.println("\nPressione Enter para continuar...");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
