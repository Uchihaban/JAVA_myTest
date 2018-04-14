package dataStructure;

/*
import java.util.Iterator;
import java.util.Stack;

public class MyStack{

	Stack<Integer> stack = new Stack<Integer>();
	 
	public void push(int node) {
        stack.push(node);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
    	int min  = stack.peek();
    	Iterator<Integer> it = stack.iterator();
        while(it.hasNext()){
        	int tep = it.next();
        	if(tep<min){
        		min = tep;
        	}	
        }
		return min;
        
    }
    
}*/
//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
import java.util.Stack;

public class MyStack4{
	    //使用两个栈。一个用来保存当前栈中的元素，一种保存每一步最小值。
		Stack<Integer> stack= new Stack<Integer>();
        Stack<Integer> stackmin= new Stack<Integer>();
    
    public void push(int node) {
    	stack.push(node);//将当前数据压入stack
    	if(stackmin.empty()){
    		stackmin.push(node);//若stackmin为空，也将当前数据压入stackmin
    	}else if(node<min()){
    		stackmin.push(node);//若stackmin不为空，将当前数据与min比较
    	}else{
    		int newmin = stackmin.peek();
    		stackmin.push(newmin);
    	}
    }
    
    public void pop() {
    	if(stack.empty()){
    		throw new RuntimeException("empty");
    	}
        stackmin.pop();
    	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
    	if(stack.empty()){
    		throw new RuntimeException("empty");
    	}
    	return stackmin.peek();
    }
}