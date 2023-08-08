
public class Professor {
	public String titulacao;
	public String nome;
	public int matricula;
	public Professor(String titulacao, String nome, int matricula) {
		super();
		this.titulacao = titulacao;
		this.nome = nome;
		this.matricula = matricula;
	}
	public Professor() {
		super();
	}
	
	public String getDescricao() {
		return "Prof. " + this.titulacao + " " + this.nome + " - mat " + this.matricula;
	}
}
	