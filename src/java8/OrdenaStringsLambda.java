package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStringsLambda {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("nome da escola");
		palavras.add("endereço da casa");
		palavras.add("país");
		
		System.out.println(palavras.toString());
		
		palavras.sort((s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
			/*if(s1.length() < s2.length())
				return -1;
			else if(s1.length() > s2.length())
				return 1;
			
			return 0;*/
		}); 
		
		
		// ------ consumir uma string com foreach java 8
		palavras.forEach(s -> { System.out.println(s); }); // cara vez que percorrer ele executa o accept
		
		palavras.forEach(System.out::println); // usando references
		
		// exemplo com thread usando lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();

		
	}
}
