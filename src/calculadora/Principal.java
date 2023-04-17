package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int aux;
		
		System.out.println("Bienvenido a la calculadora chusquera");
		do {
			System.out.println(	"Indique que quiere hacer:\n"
					+ 			"(1) sumar +\n"
					+ 			"(2) restar -\n"
					+ 			"(3) multiplicar *\n"
					+ 			"(4) dividir /\n"
					+ 			"(5) resto % \n"
					+ 			"(6) salir");
		String respuesta= leer.nextLine();
		aux= Integer.parseInt(respuesta);
		
		switch(aux) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 0:
			break;
		default:
			break;
		}
			
		} while(aux!=0);
		System.out.println("Gracias por usar la calculadora chusquera");
		leer.close();
	}

}
