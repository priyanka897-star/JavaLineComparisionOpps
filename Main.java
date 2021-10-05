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
		
		Point p3 = new Point();
		System.out.println("Enter x value for point 3");
		p3.x = ip.inputInteger();
		System.out.println("Enter y value for point 3");
		p3.y = ip.inputInteger();
		
		Point p4= new Point();
		System.out.println("Enter x value for point 4");
		p4.x = ip.inputInteger();
		System.out.println("Enter y value for point 4");
		p4.y = ip.inputInteger();
	        ip.scannerClose();
		
		Line line1 = new Line();
		line1.p1 = p1;
		line1.p2 = p2;
		
		Line line2 = new Line();
		line2.p3 = p3;
		line2.p4 = p4;
		
		
		
		Double lineLength1 = line1.getLengthLine1(p1, p2);
		Double lineLength2 = line1.getLengthLine2(p3, p4);
		System.out.println("Line 1 Length:" +lineLength1);
		System.out.println("Line 2 Length:" +lineLength2);
	        if (lineLength1.equals(lineLength2))
                   System.out.println("Line1 and Line2 are equal");
               else 
       	           System.out.println("Line1 and Line2 are not equal");
    }
	
}






