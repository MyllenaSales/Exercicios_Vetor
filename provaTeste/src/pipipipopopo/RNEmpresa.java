package pipipipopopo;
import java.util.ArrayList;

public class RNEmpresa {
	
	private ArrayList<Empresa> empresas;
	
	
	public RNEmpresa () {
		empresas = new ArrayList <Empresa>();
	}
	
	public void addEmpresa (Empresa empresa) {
		empresas.add(empresa);
	}
	
	public void listarEmpresas () {
		for(Empresa e: empresas) {
			System.out.println(e);
		}
	}
	
	public void buscarEmpresa (String nome) {
		
		for(Empresa e: empresas) {
			
			if(nome.equalsIgnoreCase(e.getNome())) {
				System.out.println(e);
			}
		}
	}

}
