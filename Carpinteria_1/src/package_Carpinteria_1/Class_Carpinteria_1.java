/**
 * 
 */
package package_Carpinteria_1;
import java.util.*;
/**
 * @author leand
 *
 */
public class Class_Carpinteria_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración e inicializacion de Variables especificas al metodo main
		String Bienvenida = ("Bienvenido a la fabrica de muebles");
		
		String Pregunta1 = ("Del siguiente menú elija el numero del mueble que desea");
		String Pregunta1_1 = ("¿Desea que la cama sea Lacada o Pintada?");
		
		String Opcion1 = ("1. Si desea que se fabrique una cama, escoja el numero 1");
		String Opcion2 = ("2. Si desea que se fabrique un escritorio, escoja el numero 2");
		String Opcion3 = ("1. Si desea que la cama sea Lacada, escoja 1");
		String Opcion4 = ("2. Si desea que la cama sea Pintada, escoja 2");
		
		String Respuesta1 = ("El Ebanista esta haciendo la cama con la Caladora");
		String Respuesta2 = ("El Ebanista esta haciendo el escritorio con la Lijadora Rotoorbital");
		String Respuesta1_a = ("El mueble que quiere elaborar es la cama y esta Lacada");
		String Respuesta1_b = ("El mueble que quiere elaborar es la cama y esta Pintada");
		
		String RespuestaError = ("El ingreso de datos no es valido");
		String FinalPrograma = ("Final del Programa");
		
		int opcion_menu = 0; //Primer Condicional
		int opcion_menu2 = 0; //Segundo Condicional
		
		//Creacion de un objeto que proviene de una clase y utilizacion de un metodo
		Scanner ingreso_consola = new Scanner(System.in);
		
		do
		{
			//interaccion con el usuario
			System.out.println(Bienvenida);
			System.out.println(Pregunta1);
			System.out.println(Opcion1);
			System.out.println(Opcion2);
			
			//ingreso datos desde consola
			opcion_menu = ingreso_consola.nextInt();
			
			//Estructuras condicionales
			if(opcion_menu == 1)
			{
				System.out.println(Respuesta1);	
				System.out.println(Opcion3);
				System.out.println(Opcion4);
			opcion_menu2 = ingreso_consola.nextInt();
				if(opcion_menu2 == 1)
				{
					System.out.println(Respuesta1_a);
					}
				else if(opcion_menu2 == 2)
				{
					System.out.println(Respuesta1_b);
				}
				else
				{
					System.out.println(RespuestaError);
				}
				}
			else if(opcion_menu == 2)
			{
				System.out.println(Respuesta2);
			}
			else
			{
				System.out.println(RespuestaError);
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}

		while ((opcion_menu == 1) && (opcion_menu == 2));
		System.out.println(FinalPrograma);
}
}
