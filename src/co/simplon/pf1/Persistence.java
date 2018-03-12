package co.simplon.pf1;

import java.util.ArrayList;
import java.util.Scanner;

public class Persistence {

	public static void main (String[] args) {

		int num=0, nbDigit=0;

		Scanner input= new Scanner(System.in);

		System.out.println("Saisir un entier positif :");
		num= input.nextInt();
		input.nextLine();
		
		nbDigit= countDigit(num);

		/* 
		 * 1. décomposer le nombre en digits
		 * 2. multiplier les digits
		 * 3. décomposer le résultat en digits
		 * 3. continuer tant que la multiplication 
		 */

		int[] intArr= sepDigit(num);
		
		//System.out.println(multArray(intArr));
		
		input.close();
	}
	
	public static int countDigit(int nb) {
		return (int)(Math.log10(nb)+1);
	}

	public static int[] sepDigit(int nb) {
		//ArrayList<Character> arrChar= new ArrayList<Character>();
		//Integer intObj= new Integer(nb);
		char[] nbToCharArr= (new Integer(nb)).toString(nb).toCharArray();
		int[] res=new int[nbToCharArr.length];

		for (int i=0; i < nbToCharArr.length; ++i) {
			res[i]= Character.getNumericValue(nbToCharArr[i]);
		}

		return res;
	}
	
	public static int multArray(int[] arrInt) {
		int res=1;
		
		for (int i= 0; i < arrInt.length; ++i) {
			res*= arrInt[i];
		}
		
		return res;
	}

}
