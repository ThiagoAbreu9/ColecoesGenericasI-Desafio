import java.util.*;
public class Aluno {
	public String nome;
	public int matricula;
	public int anoNascimento;
	
	public Aluno(String nome, int matricula, int anoNascimento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	public Aluno() {
		super();
	}
	public String getAluno() {
		return nome;
	}
	public void setAluno(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		int result;
		result = ano - this.anoNascimento;
		return result;
	}
	public String getDescricao() {
		return this.nome + " (mat=" + this.matricula + ", idade=" + getIdade() + ")";
	}
	
	
}
