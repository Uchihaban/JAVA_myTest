package dataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author zhengban
 *
 */
/**
 * 使用递归函数和栈 逆序一个栈
 */
public class MyStack1{
	
	public static int getLast(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.empty()){
			return result;
		}else{
			int last = getLast(stack);
		    return last;
		}
		
	}
	
	public static void reverse(Stack<Integer> stack){
		if(stack.empty()){
			return;
		}
		int i = getLast(stack);
		reverse(stack);
		stack.push(i);
	}
	
	
}