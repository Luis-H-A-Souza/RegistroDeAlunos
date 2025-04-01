package executable;

public class Aluno {
	public Aluno anterior = null;
	public Aluno proximo = null;
	public String nome;

	public Aluno getAnterior() {
		return anterior;
	}

	public void setAnterior(Aluno anterior) {
		this.anterior = anterior;
	}

	public Aluno getProximo() {
		return proximo;
	}

	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
