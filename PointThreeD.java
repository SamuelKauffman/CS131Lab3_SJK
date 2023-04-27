
/**
 * @author sam Kauffman
 * @version 1.0
 * 
 * Takes in 3 different points
 *
 */
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;

	/**
	 * Default Constructor
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end default constructor

	/**
	 * @param xPoint
	 * @param yPoint
	 * @param zPoint
	 */
	public PointThreeD(double xPoint, double yPoint, double zPoint) {
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.zPoint = zPoint;
	}//end constructor

	/**
	 * toString method, prints all points
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Point X: " + this.xPoint + "\n");
		sb.append("Point Y: " + this.yPoint + "\n");
		sb.append("Point Z: " + this.zPoint + "\n");
		return sb.toString();
	}//end toString
}
