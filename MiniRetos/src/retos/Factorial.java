package retos;

import java.util.Scanner;

/*FACTORIAL
Crea una función que calcule
el factorial de un número.*/
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digita un número para calcular su factorial: ");
		int num = sc.nextInt();
		System.out.println(factorial(num));
		sc.close();

	}
	
	public static int factorial(int num) {
		int result = 1;
		if(num == 0) {
			return 1;
		} else {
			for(int i = num; i >= 1; i--) {
				result *= i;
			}
			return result;
		}
	}

}
