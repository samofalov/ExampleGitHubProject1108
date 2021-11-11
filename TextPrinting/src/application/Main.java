package application;

import java.util.Scanner;

public class Main extends Object {

	public static void main(String[] args) {

		System.out.println("From which letter you would like to print an alphabet?");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputText = scanner.next().toLowerCase();
		
		scanner.close();
		
		char input = inputText.charAt(0);
		
		if(!Character.isAlphabetic(input)) {
			System.out.println("This is not a letter, goodbye.");
			return;
		}
		
		for (char c = input; c <= 'z'; c++) {
				
			String symbol = ", ";
		
			if(c == 'z') {
				symbol = ".";
			}
			
			System.out.print(c + symbol);
		}
	}
}
