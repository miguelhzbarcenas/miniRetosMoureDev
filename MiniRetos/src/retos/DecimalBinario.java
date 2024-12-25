package retos;

/*
 * DECIMAL A BINARIO
Crea un programa se encargue de
transformar un número decimal a binario.*/

public class DecimalBinario {

	public static void main(String[] args) {
		
		System.out.println(decimalToBinary(11));

	}
	
	public static String decimalToBinary(int num) {
		String resultado = "";
		int numeroActual = num;
		
		while(numeroActual > 0) {
			resultado = numeroActual%2 + resultado;
			numeroActual = numeroActual/2;
		}
		
		return resultado;
	}

}
