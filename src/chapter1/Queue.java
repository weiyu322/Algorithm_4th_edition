package chapter1;

/*
 * 1.3 队列 链表实现
 */

public class Queue<Item> 
{
	private class Node
	{
		Item item;
		Node next;
	}
	
	private int N;
	private Node first;
	private Node last;
	
	public boolean isEmpty()
	{
		return N == 0;
	}
	
	public int size()
	{
		return N;
	}
	
	//表尾添加元素
	public void enqueue(Item item)
	{
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
		N++;
	}
	
	public Item dequeue()
	{
		Item item = first.item;
		first = first.next;
		if (isEmpty())
			last = null;
		N--;
		return item;
		
	}
}
