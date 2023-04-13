
package gestordeposito;

import java.util.Scanner;
public class GestorDeposito {
 
	public static void main(String[] args){
		String titular;
		double capital;
		int plazoDias;
		double tipoInteres;
		double tipoInteresAmpliado;
		double capitalAmpliado;
		Scanner scan = new Scanner(System.in);
		// Datos para el depóstio básico
		System.out.println("Introduce datos para el depósito básico");
		System.out.println("Introduce nombre y apellidos del titular");
		titular = scan.nextLine();
		System.out.println("Introduce capital a invertir");
		capital = scan.nextDouble();
		System.out.println("Introduce el número de días");
		plazoDias = scan.nextInt();
		System.out.println("Introduce el tipo de interés");
		tipoInteres = scan.nextDouble();
		Deposito deposito1 = new Deposito(titular, capital, 
				plazoDias, tipoInteres);
		// Datos para el depóstio estructurado
		System.out.println("Introduce datos para el depósito básico");
		System.out.println("Introduce nombre y apellidos del titular");
		titular = scan.nextLine();
		System.out.println("Introduce capital básico a invertir");
		capital = scan.nextDouble();
		System.out.println("Introduce el número de días");
		plazoDias = scan.nextInt();
		System.out.println("Introduce el tipo de interés básico");
		tipoInteres = scan.nextDouble();
		System.out.println("Introduce el tipo de interés ampliado");
		tipoInteresAmpliado = scan.nextDouble();
		System.out.println("Introduce el capital ampliado");
		capitalAmpliado = scan.nextDouble();
		DepositoEstructurado deposito2 = new DepositoEstructurado(titular, capital, 
				plazoDias, tipoInteres, tipoInteresAmpliado, capitalAmpliado);
		System.out.println("El resultado del depósito básico es: " + deposito1.liquidar());
		System.out.println("El resultado del depósito estructurado es: " + deposito2.liquidar());
	}
}
    

