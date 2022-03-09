/**
 * 
 */
package package_funcion_multiplicacion;

/**
 * @author leand
 *
 */
public class Class_Funcion_Multiplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Declarar Variables
		//int x, y, auxiliar_multiplicacion;
		int x;
		int y;
		int auxiliar_multiplicacion;
		
		
		// inicializacion Variables
		// x = y = auxiliar_multiplicacion = 0;
		x = 5;
		y = 0;
		auxiliar_multiplicacion =0;
		
		for (y = 0; y < 7; y++)
		{
			auxiliar_multiplicacion = x + auxiliar_multiplicacion;
			System.out.println("Esta entrando al ciclo No: " + y);
			System.out.println("El resultado temporal de la multiplicacion es: " + auxiliar_multiplicacion);
			}
		System.out.println("");
		
		System.out.println("\n\nEL Resultado de la multiplicacion es: " + auxiliar_multiplicacion);
		}
}
