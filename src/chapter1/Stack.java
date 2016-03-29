package chapter1;

/*
 * 1.2 ��ѹ��ջ ����ʵ��
 */



public class Stack<Item> 
{
	private class Node
	{
		//�ڵ����ݽṹ
		Item item;
		Node next;
	}
	
	private Node first;
	private int N;
	
	public boolean isEmpty()
	{
		return N == 0;
	}
	
	public int size()
	{
		return N;
	}
	
	//ͷ�巨push
	public void push(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Item pop()
	{
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
}
