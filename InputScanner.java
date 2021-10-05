package javalinecomparision;
 
import java.util.Scanner;

public class InputScanner {
	public static Scanner scanner = new Scanner(System.in);

	// To take Integer input
	public  int inputInteger() {
		return scanner.nextInt();
	}

	// To take Double input
	public  double inputDouble() {
		return scanner.nextDouble();
	}

	// To take Float input
	public float inputFloat() {
		return scanner.nextFloat();
	}

       public void scannerClose() {
	 scanner.close();
	 }
}

