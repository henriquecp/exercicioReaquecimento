package reAquecimento;

public class Client {
	
	private String nome;
	private int idade;
	
	public Client(String nome, int idade){
		nome = nome;
		idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
