package application;

public class Main extends Object {

	public static void main(String[] args) {

		for (char c = 'a'; c <= 'z'; c++) {
				
			String symbol = ", ";
		
			if(c == 'z') {
				symbol = ".";
			} else {
				// TODO: some stuff
			} 
			
			System.out.print(c + symbol);
		}
	}
}
