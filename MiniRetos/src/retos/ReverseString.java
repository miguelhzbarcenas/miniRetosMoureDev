package retos;
/*
 * INVERSIÓN DE CADENAS
Crea una función que invierta
una cadena de texto.*/

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("Hola mundo!"));


	}
	
	public static String reverseString(String string) {
		char[] stringReverse = string.toCharArray();
		String newString = "";
		for(char c : stringReverse) {
			newString = c + newString;
		}
		return newString;
	}

}
