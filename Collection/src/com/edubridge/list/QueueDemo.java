package com.edubridge.list;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*program to demonstrate on queue, to implement
 * a queue use PriorityQueue*/
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<>();
		q1.add(15);
		q1.add(11);
		q1.add(3);
		q1.add(2);
		System.out.println(q1);
		for(int i:q1)
		{
			System.out.print(i+" ");
		}
		//Deque<Integer>d=new ArrayDeque<>();
		Deque<Integer>d=new LinkedList<>();
		d.add(15);
		d.add(11);
		d.add(3);
		d.add(2);
		System.out.println(d);
		d.addFirst(1);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		/*d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();*/

		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();

		System.out.println(d);


		

	}

}
