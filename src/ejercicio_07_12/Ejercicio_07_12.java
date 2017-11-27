/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner
		int[] numeros = new int[10];	// Create an array of length ten

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = input.nextInt();

		// Invoke the method to reverse the numbers
		reverse(numeros);

		// Display the numbers
		for (int e: numeros) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/** Method reverse reverses the array passed in the argument */
	public static void reverse(int[] list) {
		int temperatura;
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temperatura = list[i];
			list[i] = list[j];
			list[j] = temperatura;
		}
	}
}
