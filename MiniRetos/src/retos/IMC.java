package retos;

import java.util.Scanner;

/*IMC
Crea una calculadora del
índice de masa corporal.*/
public class IMC {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ingresa tu peso en kg: ");
			int peso = sc.nextInt();
			
			System.out.println("Ingresa tu estatura en cm: ");
			int estatura = sc.nextInt();
			
			System.out.println("Estas en " + imc(peso,estatura));
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Los valores introducidos son incorrectos");
			System.out.println("Intentalo de nuevo");
		}
			
		
		
		
	}
	
	public static String imc(int peso_KG, int estatura_CM) {
		float estaturaM = (float)estatura_CM / 100;
		float imc = peso_KG/(estaturaM*estaturaM);
		System.out.println(estaturaM);
		System.out.println("Tu imc es " + imc);
		
		if(imc >= 30) {
			return "Obesidad";
		} else if(imc >= 25 && imc < 30) {
			return "Sobrepeso";
		} else if(imc >= 18.5 && imc < 25) {
			return "Peso Normal";
		} else{
			return "Peso bajo";
		}
	}
	

}
