class Solution {
	
	public static String infixToPostfix(String s) {
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		
		for (char ch : s.toCharArray()) {
			
			if (Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			}
			
			else if (ch == '(') {
				st.push(ch);
			}
			
			else if (ch == ')') {
				while (!st.isEmpty() && st.peek() != '(') {
					sb.append(st.pop());
				}
				st.pop(); // remove '('
			}
			
			else {
				while (!st.isEmpty()
					 && st.peek() != '('
				 && (precedence(st.peek()) > precedence(ch)
				 || (precedence(st.peek()) == precedence(ch) && ch != '^'))) {
					
					sb.append(st.pop());
				}
				
				st.push(ch);
			}
		}
		
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		return sb.toString();
	}
	
	private static int precedence(char ch) {
		
		switch (ch) {
			case '^':
			    return 3;
			case '*':
			case '/':
			    return 2;
			case '+':
			case '-':
			    return 1;
			default:
			    return - 1;
		}
	}
}
