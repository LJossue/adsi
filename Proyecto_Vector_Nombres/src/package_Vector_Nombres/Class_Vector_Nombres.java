/**
 * 
 */
package package_Vector_Nombres;

/**
 * @author leand
 * Primer vector dirigido a almacenar nombres
 *
 */
public class Class_Vector_Nombres 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaracion e inicializacion del vector
		int ind_1 = 0;
		int numero_posiciones;
		//int []
		String[] nombres_usuarios = {"Kylian Mbappé", "Neymar Jr", "Lionel Messi", "Angel Di María"};
		
		numero_posiciones = nombres_usuarios.length;
		System.out.println("El Equipo tiene: " + numero_posiciones + " Jugadores");
		
		for (ind_1  = 0; ind_1 < numero_posiciones; ind_1++)
		//Impresion del vector
		System.out.println(nombres_usuarios[ind_1]);		

	}

}
