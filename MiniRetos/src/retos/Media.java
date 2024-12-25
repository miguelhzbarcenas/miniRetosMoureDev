package retos;

/*MEDIA
Calcula la media de un
listado de números.*/
public class Media {

	public static void main(String[] args) {
		
		float[] listaNumeros = { 9.8f, 10.4f, 10.5f, 9.3f, 9.7f, 10.7f, 10.4f, 9.9f, 10.4f, 10.4f, 10.0f, 10.3f, 9.9f, 10.2f, 9.8f, 10.1f, 10.2f, 9.7f, 10.2f, 10.0f, 9.4f, 10.5f, 9.7f, 9.8f };
		float[] listaNumeros2 = {9.0f, 10.3f, 10.2f, 10.6f, 10.1f, 10.6f, 9.9f, 10.5f, 9.2f, 9.5f, 10.8f, 10.7f, 10.4f, 10.6f, 9.1f};
		
		System.out.println(media(listaNumeros));
		System.out.println(media(listaNumeros2));
	}
	
	public static float media(float[] listaNumeros) {
		float suma = 0;
		
		for(float numero : listaNumeros) {
			suma += numero;
		}
		
		float resultado = suma/listaNumeros.length;
		return resultado;
	}

}
