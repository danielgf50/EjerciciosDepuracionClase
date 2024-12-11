package FactorialDanielGonzalezFranco;

import java.util.Scanner;

public class factorialDanielGonzalezFranco {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         //TODO: realizar cambios//
		 // Pedir al usuario que ingrese un número
		 System.out.print("Introduce un número para calcular su factorial: ");
		 int number = scanner.nextInt();

		 // Calcular y mostrar el factorial
		 if (number < 0) {
		     System.out.println("El factorial no está definido para números negativos.");
		 } else {
		     long factorial = 1;
		     for (int i = 1; i <= number; i++) {
		         factorial *= i; // Multiplica acumulativamente
		         System.out.println("El factorial de " + i + " es: " + factorial);
		     }
		 }

		 // Cerrar el escáner
		       scanner.close();

		

	}

}
