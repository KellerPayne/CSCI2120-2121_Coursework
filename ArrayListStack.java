import java.util.ArrayList;

// Generic implementation of Stack using Generic implementation of
// ArrayList with top of stack at end of ArrayList.

public class ArrayListStack <T> implements Stack<T> {

	private ArrayList<T> elements;
	
	public ArrayListStack() {
		elements = new ArrayList<T>();
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
    @Override
	public void push(T item) {
		elements.add(item);
	}
	
    // this is the "return but don't delete" operation
    // in a stack, the "next" items are returned from the "top" of the stack
    @Override
	public T peek() {
		return elements.get(elements.size()-1);
	}
	
    // this is the "delete and return" operation
    // in a stack, the "next" items are deleted from the "top" of the stack 
    @Override
	public T pop() {
		T elementToReturn = elements.get((elements.size()-1));
		elements.remove((elements.size()-1));
		return elementToReturn; 
	}


	public static void main(String[] args){
		ArrayListStack test1 = new ArrayListStack();

		test1.push("This");
		System.out.println(test1.peek());
		test1.push("is");
		System.out.println(test1.peek());
		test1.push("a");
		System.out.println(test1.peek());
		test1.push("stack");
		System.out.println(test1.peek());
		test1.pop();
		System.out.println(test1.peek());
		test1.pop();
		System.out.println(test1.peek());
	}
	
} // end class ArrayListStack
