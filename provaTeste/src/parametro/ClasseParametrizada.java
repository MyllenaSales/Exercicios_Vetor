package parametro;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ClasseParametrizada <T>{
	
	private ArrayList <T> objects;
	
	public ClasseParametrizada() {
		objects = new ArrayList<T>();
	}
	
	public void addObject (T object) {
		objects.add( object);
	}
	
	public void listarObjects () {
		for(T t: objects) {
			System.out.println(t);
		}
	}
	public void buscarPorNome (Predicate<T> nome) {
		for (T t: objects) {
			if(nome.test(t)) {
				System.out.println(t.toString());
			}
		}
	}
	
}

