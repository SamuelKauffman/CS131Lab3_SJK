
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;

	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}

	public PointThreeD(double xPoint, double yPoint, double zPoint) {
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.zPoint = zPoint;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Point X: " + this.xPoint + "\n");
		sb.append("Point Y: " + this.yPoint + "\n");
		sb.append("Point Z: " + this.zPoint + "\n");
		return sb.toString();
	}
}
