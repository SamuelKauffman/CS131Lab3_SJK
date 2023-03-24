
public class Square {
	private double side;
	
	public Square() {
		side = 0;
	}
	public Square(double side) {
		this.side = side;
	}
	public double getArea(){
		return side*side;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Side: " + this.side + "\n");
		sb.append("Area: " + this.getArea() + "\n");
		return sb.toString();
	}
}
