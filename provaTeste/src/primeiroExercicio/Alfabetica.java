package primeiroExercicio;

import java.util.Arrays;

public class Alfabetica {
	
	private String[] nomes;
	private  int capacidade = 10;
	int contador=0;
	public Alfabetica() {
		nomes = new String[capacidade];
	}
	
	public Alfabetica (String[ ] nomes, int capacidade) {
		
		this.nomes = nomes;
		this.capacidade = capacidade;
	}

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void addVetor (String nome) {
		
		if(contador <capacidade) {
			nomes[contador] = nome;
			contador ++;
		} else {
			System.out.println("O vetor está cheio!");
		}
	}
	
	public void listarNomes() {
		Arrays.sort(nomes);
		for(String n: nomes) {
			System.out.println(n);
		}
	}
	
}
