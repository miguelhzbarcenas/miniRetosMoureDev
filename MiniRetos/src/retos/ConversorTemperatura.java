package retos;

import java.util.Scanner;

/*CONVERSOR DE TEMPERATURAS
Crea un conversor entre
grados Celsius y Fahrenheit. */
public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean programaActivo = true;
		while(programaActivo) {
			
			try {
				
				System.out.println(""
						+ "***** Bienvenido *****\n"
						+ "1. Convertir °C a °F\n"
						+ "2. Convertir °F a °C\n"
						+ "3. Salir\n");
				System.out.print("Selecciona una opción: ");
				
				String opcion = sc.next();
				
				switch (opcion) {
				case "1": {
					System.out.print("Ingresa los °C: ");
					float celcius = sc.nextFloat();
					System.out.println(celcius + " °C son igual a " + celciusToFharenheit(celcius) + " °F");
					System.out.println("..........................................................\n");
					
					break;
				}
				
				case "2": {
					System.out.print("Ingresa los °F: ");
					float fahrenheit = sc.nextFloat();
					System.out.println(fahrenheit + " °F son igual a " + FahrenheitToCelcius(fahrenheit) + " °C");
					System.out.println("..........................................................\n");
				
					break;
				}
				
				case "3": {
					System.out.println("Cerrando programa...");
					programaActivo = false;
					
					break;
				}
					

				default: System.out.println("Opción invalida... Intentalo nuevamente");
				System.out.println("..........................................................\n");
						
					break;
				}
				
				
				
			} catch (Exception e) {
				System.out.println("Por favor selecciona una opcion valida...");
				System.out.println("..........................................................\n");
				sc.next();
		
			}
			
			
		}
		sc.close();
		
		

	}
	
	public static float celciusToFharenheit(float celcius) {
		return (celcius*9/5) + 32;
	}
	
	public static float FahrenheitToCelcius(float fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

}
