package retos;

import java.util.Arrays;

/*
 * ANAGRAMAS
Comprueba si dos cadenas
de texto son anagramas.
*/
public class Anagrama {

	public static void main(String[] args) {
		
		areAnagrama("Hola", "aloh");
	}
	
	
	public static void areAnagrama(String string1, String string2) {
		
		char[] palabra1 = string1.toLowerCase().replace(" ", "").toCharArray();
		char[] palabra2 = string2.toLowerCase().replace(" ", "").toCharArray();
		
		Arrays.sort(palabra1);
		Arrays.sort(palabra2);
		
		String mensaje = (Arrays.compare(palabra1, palabra2) == 0) ? "Son Anagrama" : "No son anagrama";
		
		System.out.println(mensaje);
		
	}

}