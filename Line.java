package javalinecomparision;

public  class Line {
	Point p1, p2,p3,p4;
	
	public double getLengthLine1(Point p1, Point p2) {
		   return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
	   }
	
	public double getLengthLine2(Point p3, Point p4) {
		   return Math.sqrt(Math.pow(p3.x-p4.x,2)+Math.pow(p3.y-p4.y,2));
	   }
	
	public   void compare(Double lineLength1, Double lineLength2) {
		
		// TODO Auto-generated method stub
		if(lineLength1.compareTo(lineLength2) == 0) {
			System.out.println("Line 1 and Line2 are equal");
		}
		else if(lineLength1.compareTo(lineLength2) > 0) {
			
			System.out.println("Line 1 is greater than Line2");
		}
		else {
			System.out.println("Line 2 is greater than Line1");
		}
    }
}
