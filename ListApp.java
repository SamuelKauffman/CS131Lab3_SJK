
public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<PointThreeD> pointArray = new ArrayList<>();
		ArrayList<Square> squareArray = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			stringList.addItem("Item " + i);
			pointArray.addItem(new PointThreeD(4,5,3));
			squareArray.addItem(new Square(5));
		}
		System.out.println(stringList.toString());
		System.out.println(pointArray.toString());
		System.out.println(squareArray.toString());
	}

}
