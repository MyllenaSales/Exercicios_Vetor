package primeiroExercicio;

import java.util.Arrays;

public class Soma {
	
	private double[] numeros;
	private double soma=0;
	private int posicao=0;
	
	public Soma() {
		numeros  = new double[10];
	}
	public Soma(double[] numeros, double soma, int posicao) {
		super();
		this.numeros = numeros;
		this.soma = soma;
		this.posicao = posicao;
	}
	public double[] getNumeros() {
		return numeros;
	}
	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public void addValor(double valor) {
		if(posicao<numeros.length) {
			numeros[posicao] = valor;
			posicao ++;
			soma = soma + valor;
		}else {
			System.out.println("vetor cheio");
		}
		
	}
	
	public void listarNumeros() {
		
		Arrays.sort(numeros);
		for(double v: numeros) {
			System.out.println(v);
		}
	}
}
