
public class Aluno {

	private int codigoAluno;
	private String nomeAluno;
	
	public int getCodigoAluno() {
		return codigoAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	

	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public Aluno(int codigoAluno, String nomeAluno) {
		this.codigoAluno = codigoAluno;
		this.nomeAluno = nomeAluno;
	}
	
}
