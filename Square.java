
/**
 * @author Sam Kauffman
 * @Version 1.0
 * 
 * Takes a side of a square and calculates its area
 */
public class Square {
	private double side;
	
	/**
	 * Default constructor
	 */
	public Square() {
		side = 0;
	}//end default
	/**
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}//end constructor
	/**
	 * @return Area
	 */
	public double getArea(){
		return side*side;
	}//end getArea
	/**
	 * Prints area and sides of a given square
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Side: " + this.side + "\n");
		sb.append("Area: " + this.getArea() + "\n");
		return sb.toString();
	}//end toString
}
