package retos;

/*TABLAS DE MULTIPLICAR
Imprime todas las tablas de
multiplicar de 1 al 10.*/
public class TablasMultiplicar {

	public static void main(String[] args) {

		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("-------------------------");
		}

	}

}
