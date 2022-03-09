/**
 * 
 */
package package_funcion_multiplicacion_d;

/**
 * @author leand
 *
 */
public class Class_funcion_multiplicacion_d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int auxiliar_multiplicacion;
		
		x = 5;
		y = 0;
		auxiliar_multiplicacion = 0;
		
		//Orden descendente
		for (y = 7; y > 0; y--){
			auxiliar_multiplicacion = x + auxiliar_multiplicacion;
			System.out.println("Esta es la entrada del ciclo: " + y);
			System.out.println("El resultado de la multiplicacion es: " + auxiliar_multiplicacion);
		}
		System.out.println("");
		System.out.println("\nEl resultado de la multiplicacion total descendente es: " + auxiliar_multiplicacion);
		System.out.println("\n\n\n");
		
		//Orden ascendente
		for (y = 0; y < 7; y++)
		{
			auxiliar_multiplicacion = x + auxiliar_multiplicacion;
			System.out.println("Esta entrando al ciclo No: " + y);
			System.out.println("El resultado temporal de la multiplicacion es: " + auxiliar_multiplicacion);
			}
		System.out.println("");
		
		System.out.println("\n\nEL Resultado de la multiplicacion total ascendente es: " + auxiliar_multiplicacion);
	}

}
