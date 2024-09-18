package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number 'n' would you like?: ");
		int n = in.nextInt();
		// Step One, create an array from 2 to 40, but when printing prime numbers, include 1 as well
		int[] array;
		boolean[] bArray;
		int[] primes = {2,3,5,7};
		
		
		array = new int[n];
		bArray = new boolean[n];
		for (int i = 1; i < array.length; i++) {
			array[i] = i +1;
			bArray [i] = true;
		}
		
		//Step Two, Take out any number in the array that is divisible by 2
		int product;
		int multiple;
		for (int i = 0; i < primes.length; i++) {
			product= 0;
			multiple = 2;
			while(product < n) {
				product = primes [i] * multiple;
				if (product <= n) {
					
					multiple++;
				}
				for (int y = 0; y< array.length; i++) {
					if (array[y] == product ) {
						bArray[i] = false;
					}
				}
			}
			
		}
		for (int i = 0; i< bArray.length; i++) {
			if (bArray[i] = true) {
				System.out.println(array[i]);
			}
		}
		
		
		//Step Three, Move to the next prime number, which is 3, and then take out all numbers divisible by 3
		
		//Step Four, then find a way to move to a next number, ie array[0]
	}

}
