package retos;

/*
 * CONTADOR DE VOCALES
Crea un programa que cuente cuantas
vocales tiene una cadena de texto.*/
public class ContadorVocales {

	public static void main(String[] args) {
		String cadena = "Esto es una cadena de texto";
		
		char[] array = cadena.trim().toLowerCase().toCharArray();
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		int cont = 0;
		
		for(char letra : array) {
			for(char vocal : vocales) {
				if(letra == vocal) 
					cont++;
			}
		}
		
		System.out.println(cont);

	}

}
