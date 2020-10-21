
public class SuperStack<T> {

	private T[] items;
	private int top;
	
	
	public SuperStack (int size) {
		
	}
	
	public boolean isEmpty() {
		// TODO
		if (items.length == 0) {
			return true;
		}
		return false;
		
	}
	
	public boolean isFull() {
		// TODO
		if (top >= items.length) {
			return true;
		}
		return false;
		
	}
	
	public boolean push(T item) {
		// TODO
		if (isFull()) {
			return false;
		}
		items[top++] = item;
		return true;
	}
	
	public T pop(T item) {
		// TODO
		if (isEmpty()) {
			return null;
		}
		else {
			
			return items[top];
		}
	}
	 
}
