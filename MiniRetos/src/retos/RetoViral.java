package retos;

/*RETO VIRAL 12345678
Simula el reto viral 12345678.
Crea una función que cuente de
1 a 8, eliminando cada vez un
dígito y mostrando un espacio en
blanco en su lugar, de manera
ascendente y descendente.*/
public class RetoViral {

	public static void main(String[] args) {
		//Ascendente
		for(int i = 1; i<=8; i++) {
			
			//Cantidad de espacios
			for(int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			
			//Contador ascendente
			for(int j = i; j<=8; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Descendente
		int cont = 8;
		
		for(int i = 1; i<= 8; i++) {
			//Cantidad de espacios
			for(int j = 7; j>=i; j--) {
				System.out.print(" ");
			}
			
			//Conteo ascendente teniendo en cuenta los espacios
			for(int k = cont; k<=8; k++) {
				System.out.print(k);
			}
			cont--;
			System.out.println();
		}

	}

}
