import java.util.LinkedList;

public class LinkedListQueue<T> implements Queue<T> {
	
	private LinkedList<T> elements;
	
	public LinkedListQueue() {
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
    // in a queue, new items are inserted at the "back" of the queue
    // since my implementation using an ArrayList had the "back" of the
    // queue at the end of the ArrayList, this implementation will have
    // the "back" at the beginning of the LinkedList
    @Override
	public void enqueue(T item) {
		elements.addFirst(item);
	}

    // this is the "return but don't delete" operation
    // in a queue, the "next" items are returned from the "front" of the queue
    // returns the last element in elements since the front of the queue is at
    // the end of the LinkedList
    @Override
	public T peek() {
		return elements.getLast();
	}

    // this is the "delete and return" operation
    // in a queue, the "next" items are deleted from the "front" of the queue
    // since my implementation using an ArrayList had the "front" of the queue
    // at the beginning of the ArrayList, this implementation will have the 
    // "back" at the end of the LinkedList
    @Override
	public T dequeue() {
		T elementToReturn = elements.getLast();
		elements.removeLast();
		return elementToReturn;
	}
	
	
} // end class LinkedListQueue
