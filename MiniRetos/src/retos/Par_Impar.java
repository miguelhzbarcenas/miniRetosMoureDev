package retos;
/*
 * PAR O IMPAR
Crea un programa que compruebe si
un número entero es par o impar.*/

public class Par_Impar {

	public static void main(String[] args) {

		System.out.println(par_impar(45));

	}
	
	public static String par_impar(int num) {
		
		return (num%2 == 0) ?  "PAR" :  "IMPAR";
		
	}

}
