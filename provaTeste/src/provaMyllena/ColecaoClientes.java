package provaMyllena;

public class ColecaoClientes {
	
	Cliente[] clientes;
	int contadorCliente =0;
	private int capacidade;
	
	public ColecaoClientes(int capacidade) {
		
		this.capacidade = capacidade;
		clientes = new Cliente[capacidade];
	
	}
	
	public void cadastrarCliente (Cliente cliente) {
		
		if(contadorCliente<capacidade) {
			clientes[contadorCliente] = cliente;
			
			contadorCliente ++;
		}
	}
	
	public void listarCliente () {
		for(int i=0; i<contadorCliente;i++) {
			System.out.println(clientes[i]);
		}
	}
	
	public Cliente buscarPorNome (String nome) {
		
		for(Cliente c: clientes) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				return c;
			}
		}
		 return null;
	}
	
	public void cadastrarPorPosicao(Cliente cliente, int posicao) {
		
		if (posicao < 0 || posicao >= capacidade) {
			System.out.println("Posição inválida. Insira uma posição entre 0 e " + (capacidade - 1));
			return;
		}
		
		if (contadorCliente >= capacidade) {
			System.out.println("Vetor cheio!");
			return;
		}
		
		if (posicao < contadorCliente) {
			for (int i = contadorCliente; i > posicao; i--) {
				clientes[i] = clientes[i - 1];
			}
		}
		
		clientes[posicao] = cliente;
		if (posicao >= contadorCliente) {
			contadorCliente++;
		}
		
	}
	public void removerPorPosicao(int posicao) {
	   
	    if (posicao < 0 || posicao >= contadorCliente) {
	        System.out.println("Posição inválida. Insira uma posição entre 0 e " + (contadorCliente - 1));
	        return;
	    }

	    for (int i = posicao; i < contadorCliente - 1; i++) {
	        clientes[i] = clientes[i + 1];
	    }
	    clientes[contadorCliente - 1] = null;

	    contadorCliente--;
	}

	
	
}
