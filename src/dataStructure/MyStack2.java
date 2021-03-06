package dataStructure;

import java.util.Stack;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class MyStack2{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int poll() {
		if(stack1.empty() && stack2.empty()){
        	throw new RuntimeException("Queue is empty");
        }else if(stack2.empty()){
        	while(!stack1.empty())
        	stack2.push(stack1.pop());
        }
		return stack2.pop();
    
    }
    public int peek() {
		if(stack1.empty() && stack2.empty()){
        	throw new RuntimeException("Queue is empty");
        }else if(stack2.empty()){
        	while(!stack1.empty())
        	stack2.push(stack1.pop());
        }
		return stack2.peek();
    
    }
}