package provaMyllena;

public class ColecaoFilial {
	
	int contadorFilial;
	private int capacidade;
	Filial[] filiais;;
	
	public ColecaoFilial (int capacidade) {
		this.capacidade = capacidade;
		filiais = new Filial[capacidade];
	}
	public void cadastrarFilial (Filial filial) {
		
		if(contadorFilial <capacidade) {
			
			filiais[contadorFilial] = filial;
			contadorFilial++;
		}
		
	}
	
	public void listarFiliais () {
		for(int i=0; i<contadorFilial;i++) {
			
			System.out.println(filiais[i]);
		}
	}
	
	public Filial buscarPorNome (String nome) {
		
		for(Filial f: filiais) {
			if(nome.equalsIgnoreCase(f.getNome())) {
				return f;
			}
		}
		return null;
	}
	
	public void cadastrarPorPosicao (Filial filial, int posicao) {
		
        if (posicao < 0 || posicao > contadorFilial) {
            System.out.println("Posição inválida. Insira uma posição entre 0 e " + contadorFilial);
            return;
        }
        
   
        if (contadorFilial >= capacidade) {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais filiais.");
            return;
        }
        
        for (int i = contadorFilial; i > posicao; i--) {
            filiais[i] = filiais[i - 1];
        }
        
        filiais[posicao] = filial;
        contadorFilial++;
    
	}
	
	public void removerPorPosicao(int posicao) {
	 
	    if (posicao < 0 || posicao >= contadorFilial) {
	        System.out.println("Posição inválida. Insira uma posição entre 0 e " + (contadorFilial - 1));
	        return;
	    }

	    for (int i = posicao; i < contadorFilial - 1; i++) {
	        filiais[i] = filiais[i + 1];
	    }

	    filiais[contadorFilial - 1] = null;
	    contadorFilial--;
	}

}
