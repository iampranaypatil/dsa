package queue;

	public class CircularQueueLL {

	    private Node tail; // Only keep track of the tail for circular behavior

	    public CircularQueueLL() {
	        tail = null;
	    }

	    public boolean isEmpty() {
	        return tail == null;
	    }

	    public boolean insert(int data) {
	        Node newNode = new Node(data);

	        // Empty queue
	        if (isEmpty()) {
	            tail = newNode;
	            tail.setNext(tail); // Point to itself to form a circular link
	        } else {
	            newNode.setNext(tail.getNext()); // New node points to the old head (tail.getNext())
	            tail.setNext(newNode); // Old tail points to the new node
	            tail = newNode; // Update tail to the new node
	        }
	        return true;
	    }

	    public int remove() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty !!");
	            return -1;
	        }

	        int front = tail.getNext().getData(); // Get the front data from the next node
	        if (tail == tail.getNext()) { // Single element in the queue
	            tail = null;
	        } else {
	            tail.setNext(tail.getNext().getNext()); // Remove the front node
	        }
	        return front;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            return -1;
	        }

	        return tail.getNext().getData(); // Get the front data from the next node
	    }
	}


