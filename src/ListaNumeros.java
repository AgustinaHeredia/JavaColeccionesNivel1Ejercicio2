import java.util.*;

public class ListaNumeros {
	public static void main(String[] args) {
		LinkedList<Integer> lista1 = new LinkedList<Integer>();
		lista1.add(6);
		lista1.add(5);
		lista1.add(4);
		
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		
		System.out.println(lista1);
		System.out.println(lista2);
		
		ListIterator<Integer> iterA = lista1.listIterator(lista1.size());
		
		while (iterA.hasPrevious()) {
			
			lista2.add(iterA.previous());
		}
		System.out.println(lista2);
	}
}
