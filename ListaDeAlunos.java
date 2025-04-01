package executable;

public class ListaDeAlunos {
	private Aluno primeiro = null;
	private Aluno ultimo = null;
	private int tamanho = 0;

	public void addListaInicio(String nome) {
		Aluno aux = new Aluno();
		aux.nome = nome;
		if (tamanho == 0) {
			primeiro = aux;
			ultimo = aux;
		} else {
			aux.proximo = primeiro;
			primeiro.anterior = aux;
			primeiro = aux;
		}
		System.out.println("\n" + nome + " Adicionado ao Início da Lista!");
		tamanho++;
	}

	public void addListaFim(String nome) {
		Aluno aux = new Aluno();
		aux.nome = nome;
		if (tamanho == 0) {
			primeiro = aux;
			ultimo = aux;
		} else {
			aux.anterior = ultimo;
			ultimo.proximo = aux;
			ultimo = aux;
		}
		System.out.println("\n" + nome + " Adicionado ao Fim da Lista!");
		tamanho++;
	}

	public String removerListaInicio() {
		Aluno depois;
		String nome;
		if (tamanho == 0) {
			return ("\nA lista está vazia!");
		} else {
			nome = primeiro.nome;
			tamanho--;
			if (tamanho == 0) {
				primeiro = null;
				ultimo = null;
			} else {
				depois = primeiro.proximo;
				primeiro = depois;
				depois.anterior = null;
			}
			return ("\n" + nome + " removido com sucesso!");
		}
	}

	public String removerListaFim() {
		Aluno antes;
		String nome;
		if (tamanho == 0) {
			return ("\nA lista está vazia");
		} else {
			nome = ultimo.nome;
			tamanho--;
			if (tamanho == 0) {
				primeiro = null;
				ultimo = null;
			} else {
				antes = ultimo.anterior;
				ultimo = antes;
				antes.proximo = null;
			}
			return ("\n" + nome + " removido com sucesso!");
		}
	}

	public void exibirLista() {
		Aluno aux = primeiro;
		if (aux == null) {
			System.out.println("\nA lista está vazia!");
		} else {
			System.out.println("\n=== Lista de Alunos ===\n");
			while (aux != null) {
				System.out.println("	" + aux.nome);
				aux = aux.proximo;
			} 
		}
	}
}
