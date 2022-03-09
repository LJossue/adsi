/**
 * 
 */
package package_Carpinteria_Full;

import java.util.*;

/**
 * @author leand
 *
 */
public class Class_Carpinteria_Full {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Bienvenida = ("Bienvenido a la Carpinteria");

String Opcion1 = ("1. Si desea que se fabrique una Cama escoja el numero 1");
String Opcion2 = ("2. Si desea que se fabrique un Escritorio escoja el numero 2");
String Opcion3 = ("3. Desea Acabado con: ");
String Opcion4 = ("4. Desea Acabado con: ");

String TipoPintura1 = ("Laca");
String TipoPintura2 = ("Pintura");

String Herramienta1 = ("Caladora");
String Herramienta2 = ("Lijadora Rotoorbital");

String Respuesta1 = ("La Cama");
String Respuesta2 = ("El Escritorio");

String EbanistaMueble = ("El Ebanista está haciendo ");
String EleccionMueble = ("El Mueble que quiere elaborar es: ");

String RespuestaError = ("El ingreso de datos no es valido");
String FinalPrograma = ("Final del Programa");

String Pregunta = ("Del siguiente Menu escoja el numero ");
String Pregunta1 = ("del mueble que quiere hacer: ");
String Pregunta2 = ("del Tipo de Acabado que desea para su Mueble: ");

int OpcionMenu = 0;
int TipoPintura = 0;

String ColorPintura = "Blanco";

Scanner IngresoConsola = new Scanner(System.in);

do
{
	System.out.println(Bienvenida);
	System.out.println(Pregunta + Pregunta1);
	System.out.println(Opcion1);
	System.out.println(Opcion2);
	
	OpcionMenu = IngresoConsola.nextInt();
	
	//Estructuras condicionales
	//Condicional Principal
	if(OpcionMenu == 1)
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(EbanistaMueble + Respuesta1 + "\nCon la: " + Herramienta1);
		System.out.println("\n" + Pregunta + Pregunta2);
		System.out.println(Opcion3 + TipoPintura1);
		System.out.println(Opcion4 + TipoPintura2);
		
		TipoPintura = IngresoConsola.nextInt();
		
		if(TipoPintura == 3)
		{ 
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("El Mueble que quiere elaborar es: \r\n" + Respuesta1 + "\rY el acabado que desea es: " + TipoPintura1);
		}
		else if(TipoPintura == 4)
		{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Que color quiere para: " + Respuesta1 + "?");
			ColorPintura = IngresoConsola.next();
			System.out.println("El Mueble que quiere elaborar es: \r\n" + Respuesta1 + "\rY estara pintado de color: " + ColorPintura);
		}
		else
		{
			System.out.println(RespuestaError);
		}}
		
		else if(OpcionMenu == 2)
		{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(EbanistaMueble + Respuesta2 + "\nCon la: " + Herramienta2);
			System.out.println("\n" + Pregunta + Pregunta2);
			System.out.println(Opcion3 + TipoPintura1);
			System.out.println(Opcion4 + TipoPintura2);
			
			TipoPintura = IngresoConsola.nextInt();
			
			if(TipoPintura == 3)
			{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("El Mueble que quiere elaborar es: \r\n " + Respuesta2 + "\rY el acabado que desea: " + TipoPintura1);
			}
			else if(TipoPintura == 4)
			{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Que color quiere para: " + Respuesta2 + "?");
				
				ColorPintura = IngresoConsola.next();
				System.out.println("El Mueble que quiere elaborar es: \r\n " + Respuesta2 + " y esta pintado con el color: " + ColorPintura);
				
			}
			else
			{
			System.out.println(RespuestaError);	
			}
		}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	}
	
while ((OpcionMenu == 1) && (OpcionMenu == 2));
System.out.println(FinalPrograma);

}
	}
