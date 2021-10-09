package ACTIVIDAD_7;

import java.util.Scanner;

public class Act_7 {
	public static void main(String[] args) {
		System.out.print("Oscar David Feregrino Hernandez ACT 7 \n");
		System.out.print("ingrese un numero \n");
		Scanner p_1 = new Scanner(System.in);
		int num = p_1.nextInt();
		metodos obj_1 = new metodos();
		metodos obj_2 = new metodos();
		System.out.print("Numeros primos: \n");
		obj_1.numeros_primos(num);
		System.out.print("\n");
		System.out.print("Sucession de fibonacci: \n");
		obj_2.Fibonacci(num);
		p_1.close();
		
	}
}
