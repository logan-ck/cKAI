package ck;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class commands {
	
	required traits = new required();
	static Scanner reader 	= new Scanner(System.in);
	
	String text;
	String input;
	static boolean waiting =  true;
	
	
	/* Speaking/Communication */
	public static void say(String text) {
		
		System.out.println(text);
		
	}
	
	public static void talk() {
		while (waiting == true){
			
			say(" > How are you going today?");
			
			say(" > ");
				String input = reader.next();
			
			waiting = false;
		}
	}
}
