package primeiroExercicio;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira 10 nomes e listarei em ordem alfabetica: ");
		Alfabetica a = new Alfabetica();
		for(int i =0; i<10;i++) {
			System.out.print("Nome "+(i+1)+ ": ");
			a.addVetor(input.nextLine());
			
		}
		
		
		a.listarNomes();
		
		Soma s = new Soma ();
		System.out.println("\nInsira 10 numeros e receba a soma deles: ");
		for(int i2=0; i2<10;i2++) {
			System.out.print("Numero " +(i2+1)+ ": ");
			s.addValor(input.nextDouble());
		}
		System.out.print("Valor da soma: " + s.getSoma());
		
		
		System.out.println("\nNúmeros em ordem alfabética: ");
		s.listarNumeros();
		
	
		input.close();
	}

	}
