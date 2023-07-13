package com.tn.qa.pages;

import java.util.Stack;

public class QueUsingTwoStacks <T> {
	private Stack <T> stack1;
	private Stack <T> stack2;

	public QueUsingTwoStacks() {
		stack1 = new Stack <>();
		stack2 = new Stack <>();
		
	}
	
	public void enqueue(T item) {
		stack1.push(item);
		}

	public T dequeue() {
		if (isEmpty()) {
			throw new
			IllegalStateException("Queue is empty");
		}
		
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
				
			}
		}
		return stack2.pop();
		
	}
	public T peek() {
		if (isEmpty()) {
			throw new
			
			IllegalStateException("Queue is empty. ");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
	}
		}
		return stack2.peek();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() &&
				stack2.isEmpty();
	}
	
	public int size() {
		return stack1.size() + stack2.size();
	}

		
	}
	
			