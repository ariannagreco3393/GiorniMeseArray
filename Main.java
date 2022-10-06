package com.soprasteria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] mesi = {"gen", "feb", "mar", "apr", "mag","giu", "lug", "ago", "set", "ott", "nov", "dic"};
		int[] gg = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner in = new Scanner(System.in);
		int mese;
		System.out.println("inserisci il numero del mese che vuoi conoscere");
		mese = in.nextInt();
		
		System.out.println("il mese" + mesi[mese-1] + "ha" + gg[mese-1]  +"giorni");
		
		
	}

}
