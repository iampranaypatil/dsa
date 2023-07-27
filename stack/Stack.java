package stack;

public class Stack {

	private int size;
	private int top;
	private int [] arr;
	
	public Stack(int size) {
		this.size=size;
		top=-1;
		arr=new int [size];
	}
	
	public boolean isFull() {
		return top==(size-1);
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean push(int data) {
		if(isFull())
			return false;
		arr[++top]=data;
		return true;
	}
	
	public int pop() {
		if(isEmpty())
			return -1;
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		return arr[top];
	}
}
