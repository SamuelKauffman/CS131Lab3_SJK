
/**
 * @author sam Kauffman
 * @Version 1.0
 * 
 * 
 *
 * @param <T>
 */
public class ArrayList<T> {

	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T arList[];

	@SuppressWarnings("unchecked")
	public ArrayList() {
		/*
		 * The code below will cause a compile error because T is cast to object if we
		 * cast object to whatever T is (like a String) we will cause a runtime error.
		 * We could use a java collection like ArrayList for this.
		 */
		// arList=new T[DEFAULT_SIZE];

		// this is the proper way to initialize this object using a call to new Object.
		arList = (T[]) new Object[DEFAULT_SIZE];
	}// end empty-argument constructor

	@SuppressWarnings("unchecked")
	public ArrayList(int length) {
		// arList=new T[length]; //causes a compile error (see above)
		arList = (T[]) new Object[length];

	}// end preferred constructor

	/**
	 * @param item
	 * @return if the item was successfully added into the arraylist
	 */
	public boolean addItem(T item) {
		if (currentItem < arList.length) {
			if (arList[currentItem] != null) {
				currentItem = currentItem + 1;
			}
			arList[currentItem] = item;
			return true;
		} else {
			return false;
		}

	}//end addItem

	/**
	 * Makes the list into a String
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arList.length; i++) {
			sb.append(arList[i] + " ");
		}
		return sb.toString();

	}//end toString
}// end class
