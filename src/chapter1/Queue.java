package chapter1;

/*
 * 1.3 ���� ����ʵ��
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
	
	//��β���Ԫ��
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
