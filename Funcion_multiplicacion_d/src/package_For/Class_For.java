/**
 * 
 */
package package_For;

/**
 * @author leand
 *
 */
public class Class_For 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
{
		// TODO Auto-generated method stub
int x;
int indice_1;
int indice_2;
int auxiliar_multiplicacion;

x = 5;
auxiliar_multiplicacion = 0;


for(indice_1 = 1; indice_1 <= 5; indice_1++) 
{
	auxiliar_multiplicacion = x + auxiliar_multiplicacion;
	System.out.println("Esta entrando a la Fila No: " + indice_1);
	for (indice_2 = 1; indice_2 <= 5; indice_2 ++)
	{
			System.out.println("Esta entrando a la Columna No " + indice_2);
	}

}
	System.out.println("Llego al final de la matrix");
}

}


