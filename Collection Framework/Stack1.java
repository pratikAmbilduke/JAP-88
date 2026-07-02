import java.util.Stack;

class Stack1
{
	public static void main(String args[])
	{
		Stack<Integer> s= new Stack<>();
		s.add(10);
		s.push(20);		
		System.out.println("Before pop operatin:"+s);
		s.pop();
		System.out.println("After pop Operation:"+s);
		System.out.println(s.empty());
		s.push(30);
		System.out.println(s);
		System.out.println("Top element of the Stack:"+s.peek());
		System.out.println(s);
		System.out.println("search():"+s.search(30));
	}
}