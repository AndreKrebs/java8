package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("nome da escola");
		palavras.add("endereço da casa");
		palavras.add("país");
		
		// comparador customizado
		Comparator<String> comparador = new OrdenaListaPorTamanho();
		
		// ------ ordenando com java 7
		// apenas para ordenar	
		Collections.sort(palavras);
		System.out.println(palavras.toString());
		
		// para curtomizar a ordenação
		Collections.sort(palavras, comparador);
		System.out.println(palavras.toString());
		
		// ------ ordenando com java 8
		// apenas usando sort
		palavras.sort(null); // não precisa do Collections		
		System.out.println(palavras.toString());
		
		// com o comparator customizado
		palavras.sort(comparador); // não precisa do Collections		
		System.out.println(palavras.toString());
		
		// ------ consumir uma string com foreach java 8
		Consumer<String> consumidor = new ConsumidorDeStrings();
		palavras.forEach(consumidor); // cara vez que percorrer ele executa o accept
		
	}
}

class OrdenaListaPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		if(s1.length() < s2.length()) {
			return -1;
		} else if(s1.length() > s2.length()) {
			return 1;
		}
		
		return 0;
	}
	
}

class ConsumidorDeStrings implements Consumer<String> {

	@Override
	public void accept(String s) {
		// apenas imprime
		System.out.println(s);
	}
	
}
