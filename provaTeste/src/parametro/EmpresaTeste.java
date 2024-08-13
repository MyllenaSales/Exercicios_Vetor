package parametro;

public class EmpresaTeste {
	private String nome;
	private String telefone;
	
	public EmpresaTeste() {
		
	}
	

	public EmpresaTeste(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", telefone=" + telefone + "]";
	}

}
