/*
 * ����ջ
 */
package chapter1;

public class FixedCapcityStack<Item> {
	
	private Item[] a;
	private int len;
	int Cap;

	//���캯��
	public FixedCapcityStack(int cap)
	{
		//a = new Item[cap]�ǷǷ���
		this.Cap = cap;
		a = (Item[])new Object[cap];
		len = 0;
	}
	
	public boolean isEmpty()
	{
		return len == 0;
	}
	
	public int size()
	{
		return len;
	}
	
	public void push(Item item)
	{
		if(this.len < this.Cap)
		{
			a[len] = item;
			len++;
		}
		else
		{
			System.out.println("out of length");
			return;
		}
	}
	
	public Item pop()
	{
		if (this.len > 0)
		{
			len--;
			return a[len];
			
		}
		else
		{
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FixedCapcityStack<String> s = new FixedCapcityStack<String>(5);
		s.push("a");
		System.out.println(s.size());
	}

}
