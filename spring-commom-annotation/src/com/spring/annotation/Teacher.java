package com.spring.annotation;

import java.util.PriorityQueue;

public interface Teacher  {
	
	
	public static void main(String[] args) {
		
		PriorityQueue<Character> Q = new PriorityQueue<Character>();
		System.out.println(Q.poll());
	}

	 void teach();
	
}
