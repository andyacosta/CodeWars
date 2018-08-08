package codewars.kyu6;

import java.util.Stack;

public class CheckingGroups {

	public static void main(String[] args) {
		
	}
	
	public static boolean groupCheck(String s){	
		Stack<Character> stack = new Stack<>();
		s.chars()
		.map(i -> (char)i)
		.forEach(i -> {
				String c = String.valueOf((char)i);
				if(c.matches("[\\(\\{\\[]") ) {
					stack.push((char) i);
				}
				else if(c.matches("\\)") && !stack.isEmpty()) {
					if(String.valueOf(stack.peek()).matches("\\(") ) {
						stack.pop();
					}
				}
				else if(c.matches("\\]") && !stack.isEmpty()) {
					if(String.valueOf(stack.peek()).matches("\\[") ) {
						stack.pop();
					}
				}
				else if(c.matches("\\}") && !stack.isEmpty()) {
					if(String.valueOf(stack.peek()).matches("\\{") ) {
						stack.pop();
					}
				}
				else {
					stack.push('X');
				}
			}
		);
		return stack.isEmpty();
	}

}
