import java.util.*;
public class ArrayStack<E>
{
private ArrayList<E> stackArray = new ArrayList<E> ();
private int top=-1;

public int size()
{

return (top);

}

public boolean isEmpty()
{

return (top ==-1);
}

public E top()
{
	if(top==-1)
	{
		throw new EmptyStackException();
	}
	else
		{
			return stackArray.get(top);
		}
}

public void push (E element)
{
	top++;
stackArray.add(top,element);
}

public E pop() 
{
	if(top==-1)
	{
		throw new EmptyStackException();
	}
	else
	{
	return stackArray.remove(top--);
	}
}


public static void main (String[] args)
 {
      ArrayStack<Integer> s = new ArrayStack<Integer> ();
        s.push (212);
        s.push(34);
        s.push(5);
        s.push(7);
        s.push(6);
       Integer i = s.pop ();
       i=s.top();
       boolean j=s.isEmpty();
        System.out.format ("%4d%n", i);
        System.out.println(j);
  }

}
