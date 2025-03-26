package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double width;
	private double length;
	private double perimeter;
	private double area;
	private boolean size;
	private boolean square;

		//rectangle has-a
		//width
		//length
		//area
		//perimeter
		
		
		public Rectangle(double width, double length) {
			this.width = width;
			this.length = length;
			this.area = length * width;
			this.perimeter = (length + width) * 2;
		}
		
		public boolean square() {
			if (width == length) {
				return true;
			} else {
				return false;
			}
		}
		
		public double getArea() {
			return this.area;
		}
		
		public boolean size(Rectangle small, Rectangle large) {
			double i = small.getArea();
			double j = large.getArea();
			
			if (j > i) {
				return true;
			} else {
				return false;
			}
		}
		
		public double getLength() {
			return this.length;
		}
		
		public static void main(String[] args) {
			Rectangle small = new Rectangle(.15, .25);
			Rectangle large = new Rectangle(.25, .30);
			StdDraw.filledRectangle(0, 0, .5 * small.length, small.width);
			StdDraw.filledRectangle(0.5, 0.5, large.length, large.width);
			
		}
		
	}
