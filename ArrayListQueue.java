import java.util.ArrayList;

public class ArrayListQueue<T> implements Queue<T> {
	
	private ArrayList<T> elements;
	
	public ArrayListQueue() {
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
    // in a queue, new items are inserted at the "back" of the queue
    // in my implementation, the "back" of the queue is at the end of the ArrayList
    @Override
	public void enqueue(T item) {
		elements.add(elements.size(), item);
	}

    // this is the "return but don't delete" operation
    // in a queue, the "next" items are returned from the "front" of the queue
    @Override
	public T peek() {
		return elements.get(0);
	}

    // this is the "delete and return" operation
    // in a queue, the "next" items are deleted from the "front" of the queue
    // in my implmentation, the "front" of the queue is at the beginning of the list
    // since the .remove(int index) operation of the ArrayList class that is used 
    // will not only remove the specific element, but also shifts subsequent elements
    // one place to the left
    @Override
	public T dequeue() {
		T elementToReturn = elements.get(0);
		elements.remove(0);
		return elementToReturn;
	}
	

} // end class ArrayListQueue
