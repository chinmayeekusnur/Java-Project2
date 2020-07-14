package MethodsaPackages;

import java.util.Scanner;

public class MinsToYearsDays {

	public static void main(String[] args) {

		double MinsInAYear = 365 * 24 * 60;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the number of minutes: ");
		
		double min = input.nextDouble(); 
		
		long years = (long)(min/MinsInAYear);
		int days = (int)(min/60/24)%365;
		
		System.out.println( (int) min + " minutes is approximately " + years + " years and " + days + " days");
	}

}



