package item;

public interface Item {
	/**
	 * @param x
	 * @param y
	 * check if the point(x,y) is on the top of item
	 * */
	public boolean on(int x, int y);


	/**
	 * return a string description of the item
	 * */
	public String toString();
	
}
