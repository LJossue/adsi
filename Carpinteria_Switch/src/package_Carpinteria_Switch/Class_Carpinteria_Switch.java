/**
 * 
 */
package package_Carpinteria_Switch;
import java.util.*;
/**
 * @author leand
 *
 */
public class Class_Carpinteria_Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int opcion_menu;
Scanner ingreso_consola = new Scanner(System.in);
do
{
	System.out.println("Bienvenido a la Fabrica de Muebles");
	System.out.println("Del siguiente Menu escoja el mueble que quiere hacer por medio del numero");
	System.out.println("1. Si desea que se fabrique una Cama escoja el 1");
	System.out.println("2. Si desea que se fabrique un Escritorio escoja el 2");
	opcion_menu = ingreso_consola.nextInt();
	switch (opcion_menu)
	{
	case 1:
	{
		System.out.println("El Ebanista esta haciendo la Cama con la Caladora");
		break;
	}
	case 2:
	{
		System.out.println("El Ebanista esta haciendo el Escritorio con la Lijadora Rotoorbital");
		break;
	}
	default:
	{
		System.out.println("Error de Digitación");
	}
	}
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
} while ((opcion_menu == 1)  && (opcion_menu == 2));
System.out.println("Se salio del Programa");
	}

}
