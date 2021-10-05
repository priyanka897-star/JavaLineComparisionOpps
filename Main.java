package javalinecomparision;

public class Main {
     public static void main(String[] args) {
		
		Point p1 = new Point();
	 	InputScanner ip=new InputScanner();
	 	System.out.println("Enter x value for point 1");
		p1.x= ip.inputInteger();
		System.out.println("Enter y value for point 1");
		p1.y =ip.inputInteger(); 
		
		Point p2 = new Point();
		System.out.println("Enter x value for point 2");
		p2.x = ip.inputInteger();
		System.out.println("Enter y value for point 2");
		p2.y = ip.inputInteger();
	        ip.scannerClose();
		
		Line line = new Line();
		line.p1 = p1;
		line.p2 = p2;
		
		Double length = line.getLength(p1, p2);
		System.out.println("Line Length:" +length);
	}
}


