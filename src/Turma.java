import java.util.ArrayList;

public class Turma {
	public String disciplina;
	public int ano;
	public int semestre;
	public Professor professor;
	public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma(String disciplina, int ano, int semestre, Professor professor) {
		super();
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
	}
	public Aluno getAluno(int matricula) {
		Aluno aluno = null;
		for(int i=0; i<alunos.size();i++) {
			if(alunos.get(i).matricula == matricula) {
				aluno = alunos.get(i);
			}
		} // Se a matricula do aluno estiver na lista alunos, ele guarda o objeto aluno na variavel aluno;
		if(aluno!=null) { //se houve alguma matricula igual na lista, ele está retornando a variavel aluno;
			return aluno;
			}else {//se não houver, ele retorna nulo;
		return null;
		}
	}
	
	public void addAluno(Aluno aluno) {
		if(getAluno(aluno.matricula) == null) { //verificando se não há ninguem com essa matricula na lista;
			alunos.add(aluno);
		}else {
			return;
		}
	}
	public double getMediaIdade() {
		double tamanho = alunos.size();
		double total = 0;
		for(int i=0;i<alunos.size();i++) {
			total = total + alunos.get(i).getIdade();
		}
		total = total/tamanho;
		return total;
	}
	public String getDescricao() {
		String a = "Turma " + this.disciplina + " - " + this.ano + "/" + this.semestre + " (" + professor.getDescricao() + "):";
		for(int i=0;i<alunos.size();i++) {
			a = a + "\n- Aluno " + (i+1) + ": " + alunos.get(i).getDescricao();
		}
		return a;
	}
}
