import java.util.Stack;

public class DataStructureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput = "52*3+";
		String userInputToTurnIntoInt;
		int length = userInput.length();
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i) == '1' || userInput.charAt(i) == '2' || userInput.charAt(i) == '3'
					|| userInput.charAt(i) == '4' || userInput.charAt(i) == '5' || userInput.charAt(i) == '6'
					|| userInput.charAt(i) == '7' || userInput.charAt(i) == '8' || userInput.charAt(i) == '9')

			{
				userInputToTurnIntoInt = "" + userInput.charAt(i);
				int x = Integer.parseInt(userInputToTurnIntoInt);
				s.push(x);

			}

			else {
				int a = s.pop();
				int b = s.pop();
				int result;
				char c = userInput.charAt(i);
				if (c == '+')

				{
					result = a + b;
					s.push(result);

				} 
				else if (c == '-') 
				
				{
					result = b - a;
					s.push(result);

				} 
				
				else if (c == '*') 
				{
					result = (a * b);
					s.push(result);

				}

				else if (c == '/') {
					result = b/a;
					s.push(result);

				}

			}

		}
		System.out.println(s.pop());

	}
}
