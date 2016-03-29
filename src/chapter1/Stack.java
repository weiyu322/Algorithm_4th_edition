package chapter1;

/*
 * 1.2 下压堆栈 链表实现
 */



public class Stack<Item> 
{
	private class Node
	{
		//节点数据结构
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
	
	//头插法push
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
