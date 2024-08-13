package parametro;
import java.util.Scanner;
import java.util.function.Predicate;

public class TesteParametrizadaEmpresa {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		EmpresaTeste em = new EmpresaTeste();
		em.setNome("lindolindo");
		em.setTelefone("40028922");
		

		EmpresaTeste em2 = new EmpresaTeste();
		em2.setNome("pipipipopopo");
		em2.setTelefone("34322352");
		
		 ClasseParametrizada <EmpresaTeste> e = new ClasseParametrizada<EmpresaTeste>();
		 
		 e.addObject(em);
		 e.addObject(em2);
		 
		 System.out.println("Digite o nome da empresa e receba as informações: ");
		 String nome = input.nextLine();
		 Predicate <EmpresaTeste> achar = empresa -> empresa.getNome().equalsIgnoreCase(nome);		 

		 e.buscarPorNome(achar);
		 
		 System.out.println("\nTodas as empresas cadastradas: ");
		 e.listarObjects();
		 input.close();
	}
	
	
}
