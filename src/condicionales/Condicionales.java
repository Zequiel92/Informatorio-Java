package condicionales;

import java.util.Scanner;

public class Condicionales {
	
	public static void main(String[] args) {
		
		// Ejercico - Programa un sistema vacacional
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		String empleado;
		System.out.println("Nombre del empleado: ");
		empleado = entrada.next();
		
		// Elija el nivel de departamento, 1 - 2 - 3
		int departamento;
		System.out.println("Clave de departamento");
		departamento = entrada.nextInt();
		
		int anioDeAntiguedad;
		System.out.println("Anios de antiguedad en la empresa: ");
		anioDeAntiguedad = entrada.nextInt();
		
		
		if (departamento == 1) {
			if (anioDeAntiguedad == 1) {
				System.out.println("Hola "+empleado);
				System.out.println("Tienes 7 dias de vacaciones");
				
			} else if (anioDeAntiguedad >= 2 && anioDeAntiguedad <= 6) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 14 dias de vacaciones");
				
			} else if (anioDeAntiguedad == 7) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 20 dias de vacaciones");
				
			} else {
				System.out.println("Todavia no tiene derecho a vacaciones");
			}
			
		} else if (departamento == 2) {
			if (anioDeAntiguedad == 1) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 14 dias de vacaciones");
				
			} else if (anioDeAntiguedad >= 2 && anioDeAntiguedad <= 6) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 18 dias de vaciones");
				
			} else if (anioDeAntiguedad == 7) {
				System.out.println("Tiene derecho a 22 dias de vacaciones");
				
			} else {
				System.out.println("No tiene derecho a vacaciones");
			}
			
		} else if (departamento == 3) {
			if (anioDeAntiguedad == 1) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 18 dias de vacaciones");
				
			} else if (anioDeAntiguedad >= 2 && anioDeAntiguedad <= 6) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 22 dias de vaacaciones");
				
			} else if (anioDeAntiguedad == 7) {
				System.out.println("Hola "+empleado);
				System.out.println("Tiene derecho a 26 dias de vacaciones");
				
			} else {
				System.out.println("Todavia no tiene derecho a vacaciones");
			}
			
		} else {
			System.out.println("Todavia no tiene departamento");
		}
	
		
		
	}

}
