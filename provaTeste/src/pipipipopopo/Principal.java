package pipipipopopo;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas empresas deseja cadastrar? ");
		int qtdEmpresas = input.nextInt();
		
		input.nextLine();
		RNEmpresa rne = new RNEmpresa();
		RNFuncionario rnf = new RNFuncionario();
		for(int i =0; i<qtdEmpresas; i++) {
			
			Empresa em = new Empresa();
			System.out.print("Nome empresa "+(i+1)+": ");
			em.setNome(input.nextLine());
			System.out.print("CNPJ: ");
			em.setCnpj(input.nextLine());
			System.out.print("Telefone: ");
			em.setTelefone(input.nextLine());
			rne.addEmpresa(em);
			
			
			System.out.print("Quantos funcionarios deseja cadastrar nessa empresa? ");
			int qtdF = input.nextInt();
			input.nextLine();
			for(int i2 = 0; i2<qtdF; i2++) {
				Funcionario f = new Funcionario();
				System.out.print("Nome funcionario "+(i2+1)+": ");
				f.setNome(input.nextLine());
				System.out.print("CPF: ");
				f.setCpf(input.nextLine());
				System.out.print("RG: ");
				f.setRg(input.nextLine());
				System.out.print("Telefone: ");
				f.setTelefone(input.nextLine());
				f.setEmpresa(em);
				
				rnf.addFuncionario(f);
			}
		}
		rnf.listarFuncionarios();
		rne.listarEmpresas();
		
		
		input.close();
	}
}
