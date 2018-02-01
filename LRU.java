package com.geek;

import java.util.HashMap;

public class LRU {
	
	int capacity;
	HashMap<Integer,Node1> sol=new HashMap<Integer,Node1>();
	Node1 head=null;
	Node1 end=null;
	public LRU(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
	}
	public int get(int key)
	{
		if(sol.containsKey(key))
		{
			Node1 n=sol.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}
	private void setHead(Node1 n) {
		// TODO Auto-generated method stub
		n.next=head;
		n.pre=null;
		if(head!=null)
			head.pre=n;
		
			head=n;
		if(end==null)
			end=head;
			
		
	}
	private void remove(Node1 n) {
		// TODO Auto-generated method stub
		if(n.pre!=null)
		{
			n.pre.next=n.next;
		}
		else
			head=n.next;
		if(n.next!=null)
			n.next.pre=n.pre;
		else
			end=n.pre;
		
	}
	public void set(int key,int value)
	{
		if(sol.containsKey(key))
		{
			Node1 old=sol.get(key);
			old.value=value;
			remove(old);
			setHead(old);
		}
		else
		{
			Node1 created=new Node1(key,value);
			if(sol.size()>=capacity)
			{
				sol.remove(end.key);
				remove(end);
				setHead(created);
			}
			else
			{
				setHead(created);
			}
			sol.put(key, created);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node1{
    int key;
    int value;
    Node1 pre;
    Node1 next;
 
    public Node1(int key, int value){
        this.key = key;
        this.value = value;
    }
}