/**
 * 
 */
package package_hello_world;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author leand
 *
 */
public class Class_Hello_World 
{
	// Declarar variables
	String Mensaje = new String("Hola Mundo, este es el Grupo mejor de ADSI");
	// Inicializar variables
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String Mensaje = new String("Esta es la ficha 2450473x");
		String Nombre_Usuario = " ";
		System.out.print("Hola Mundo, este es el Grupo mejor de ADSI\n");
		System.out.println("Hola Mundo, esta es la segunda impresion");
		System.out.println("Hola Mundo, esta es la tercera impresion");
		JOptionPane.showMessageDialog(null,Mensaje);
		Nombre_Usuario = JOptionPane.showInputDialog(null,"¿Cúal es su nombre de usuario?");
		System.out.println("El usuario que esta usando el programa es: " + Nombre_Usuario);
	}

}
