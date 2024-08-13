package provaMyllena;
import java.util.Scanner;
public class Principal {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Indique a tamanho de vetor de filiais: ");
		int cp = input.nextInt();
		
		input.nextLine();
		ColecaoFilial cf = new ColecaoFilial(cp);
		
		System.out.print("Quantas filiais deseja cadastrar: ");
		int qtd = input.nextInt();
		input.nextLine();
		
		for(int i=0; i<qtd;i++) {
			Filial f = new Filial();
			System.out.print("Nome filial "+(i+1)+": ");
			f.setNome(input.nextLine());
			System.out.print("Cidade: ");
			f.setCidade(input.nextLine());
			
			cf.cadastrarFilial(f);
		}
		
		cf.listarFiliais();
		
		System.out.println("\nCadastre uma filial pela posiçaõ!\n");
		
			Filial f2 = new Filial();
			System.out.print("Nome da nova filial: ");
			f2.setNome(input.nextLine());
			System.out.print("Cidade: ");
			f2.setCidade(input.nextLine());
			
			System.out.print("Qual a posição? ");
			int posicao = input.nextInt();
			
			cf.cadastrarPorPosicao(f2, posicao);
			
			cf.listarFiliais();
			
			
			System.out.print("\nQual o tamanho do vetor de cliente?");
			int t = input.nextInt();
			
			ColecaoClientes cc = new ColecaoClientes(t);
			
			System.out.print("Quantos clientes deseja cadastrar? ");
			int resposta = input.nextInt();
			input.nextLine();
			
			for(int i2 =0; i2<resposta;i2++) {
				Cliente c = new Cliente();
				System.out.print("Nome cliente "+(i2+1)+": ");
				c.setNome(input.nextLine());
				System.out.print("RG: ");
				c.setRg(input.nextLine());
				System.out.print("Telefone: ");
				c.setTelefone(input.nextLine());
				
				System.out.print("Digite o nome da filial que ele pertence: ");
				
				String nome = input.nextLine();
				Filial filialCliente = cf.buscarPorNome(nome);
				
				c.setFilial(filialCliente);
				cc.cadastrarCliente(c);
			}
			
			cc.listarCliente();
			
			Cliente novoCliente = new Cliente();
			System.out.println("\nCadastre um cliente pela posição!\n");
			System.out.print("Nome cliente: ");
			novoCliente.setNome(input.nextLine());
			System.out.print("Rg: ");
			novoCliente.setRg(input.nextLine());
			System.out.print("Telefone: ");
			novoCliente.setTelefone(input.nextLine());
			System.out.print("Digite o nome da filial que ele pertence: ");
			String novoNome = input.nextLine();
			Filial filialNovoCliente = cf.buscarPorNome(novoNome);
			novoCliente.setFilial(filialNovoCliente);
			System.out.print("Qual posição deseja adicioná-lo?");
			int posicaoCliente = input.nextInt(); 
			cc.cadastrarPorPosicao(novoCliente, posicaoCliente);
	
			cc.listarCliente();
			
			System.out.print("\nRemover por posição!\nDigite uma posição e remova um cliente e uma filial: ");
			int p = input.nextInt();
			
			
			cc.removerPorPosicao(p);
			cc.listarCliente();
			cf.removerPorPosicao(p);
			cf.listarFiliais();
			input.close();
	}
}
