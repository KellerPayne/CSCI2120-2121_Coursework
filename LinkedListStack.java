import java.util.LinkedList;

public class LinkedListStack <T> implements Stack<T> {

	private LinkedList<T> elements;
	
	public LinkedListStack() {
		elements = new LinkedList<T>();
	}
	
    @Override
	public int size() {
		return elements.size();
	}
	
    @Override
	public boolean isEmpty() {
		if(elements.size() == 0){
			return true;
		} else {
			return false;
		}
	}
	
    // this is the "insert" operation
    // in a stack, new items are inserted at the "top" of the stack
    // since my ArrayList implementation had the top at the end of the ArrayList,
    // this implementation using LinkedList has the top at the beginning of
    // the LinkedList
    @Override
	public void push(T item) {
		elements.add(0, item);
	}
	
    // this is the "return but don't delete" operation
    // in a stack, the "next" items are returned from the "top" of the stack
    @Override
	public T peek() {
		return elements.get(0);
	}
	
    // this is the "delete and return" operation
    // in a stack, the "next" items are deleted from the "top" of the stack 
    @Override
	public T pop() {
		T elementToReturn = elements.get(0);
		elements.remove(0);
		return elementToReturn;
	}
	
} // end class LinkedListStack
