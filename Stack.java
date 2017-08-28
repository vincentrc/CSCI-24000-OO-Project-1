/*Honor Pledge: I pledge that I have neither given
nor received any help on this assignment**/

public class Stack<E>
{
	private int top;
	private int size;
	private E[] stack;
	
	//Constructor
	public Stack(int stacksize)
	{
		if(stacksize>0)
		{
			size = stacksize;
		}
		else
		{
			System.out.println("Invalid Stack size!");
			System.out.println("Using default size of 10");
			size = 10;
		}
	
	//Creating an instance
	stack = (E[]) new Object[size];
	top = -1;
	}
	
	//Push operation
	public void push(E dataElement)
	{
		//Checks to see if the stack is full
		if(isFull())
		{
			System.out.println("Your stack is full!");
			
		}
		else
		{
			//Pushes element on to stack
			stack[++top]=dataElement;
		}
	}
	
	//Pop operation
	public E pop()
	{
		//Checks to see if the stack is empty
		if(!isEmpty())
		{
			//Returns the popped element
			return stack[top--];
		}
		else
		{
			System.out.println("Stack is empty - cannot pop!");
			return null;
		}
		
	}
	
	//Checks to see if the stack is empty: T=empty F=Not
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	//Checks to see if the stack is full
	public boolean isFull()
	{
		return (top+1) == size;
	}
	
	//Gets the top element of the stack
	public E getTop()
	{
		return stack[top];
	}
	
	//Prints the contents of the stack
	public void displayStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(stack[i] + ",");
		}
	}
	
	
}