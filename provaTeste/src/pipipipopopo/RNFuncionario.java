package pipipipopopo;
import java.util.ArrayList;
public class RNFuncionario {
	
	private ArrayList<Funcionario> funcionarios;
	
	public RNFuncionario () {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	
	public void addFuncionario (Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios () {
		for(Funcionario f: funcionarios) {
			System.out.println(f.toString());
		}
		
	}
	
	public void buscarFuncionario (String nome) {
		for(Funcionario pf: funcionarios) {
			if(pf.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Aqui estão as infirmações referentes ao usuário:"+pf);
			}
		}
	}
}
