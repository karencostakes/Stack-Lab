
import java.util.Stack;
import java.util.Queue;

public class DataStructureApp {

	public static void main(String[] args) {
		String userInput = "52+";
		String userInputToTurnIntoInt;
		int length = userInput.length();

		Stack<Integer> s = new Stack<Integer>();
		int sizeOfStack;
		for (int i = 0; i < userInput.length(); i++) {
			while (userInput.charAt(i) == '1' || userInput.charAt(i) == '2' || userInput.charAt(i) == '3'
					|| userInput.charAt(i) == '4' || userInput.charAt(i) == '5' || userInput.charAt(i) == '6'
					|| userInput.charAt(i) == '7' || userInput.charAt(i) == '8' || userInput.charAt(i) == '9')

			{
				userInputToTurnIntoInt = "" + userInput.charAt(i);
				int x = Integer.parseInt(userInputToTurnIntoInt);
				s.push(x);
				// System.out.println(x);
			}

			while (userInput.charAt(i) == '+' || userInput.charAt(i) == '-' || userInput.charAt(i) == '*'
					|| userInput.charAt(i) == '/') {

				int a = s.pop();
				int b = s.pop();
				int sum;
				char c = userInput.charAt(i);

				if (c == '+')

				{
					sum = a + b;
					s.push(sum);
					System.out.println(s.pop());
				}

				else if (c == '-') {
					sum = b - a;
					s.push(sum);

				} else if (b == '*') {
					sum = a * b;
					s.push(sum);

				}

				else if (b == '/') {
					sum = a / b;
					s.push(sum);

				}

			}
			System.out.println(s.pop());
		}

	}

}
