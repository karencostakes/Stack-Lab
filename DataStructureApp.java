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
				ifNumberChangeStringToInt(userInput, s, i);
			else {
				int a = s.pop();
				int b = s.pop();
				int result;
				char c = userInput.charAt(i);
				if (c == '+')
					Addition(s, a, b);
				else if (c == '-')
					Subtraction(s, a, b);
				else if (c == '*')
					Multiplication(s, a, b);
				else if (c == '/')
					Division(s, a, b);

			}

		}
		System.out.println(s.pop());

	}

	private static void Addition(Stack<Integer> s, int a, int b) {
		// TODO Auto-generated method stub
		
	}

	private static void Multiplication(Stack<Integer> s, int a, int b) {
		// TODO Auto-generated method stub
		
	}

	private static void Subtraction(Stack<Integer> s, int a, int b) {
		// TODO Auto-generated method stub
		
	}

	public static void Division(Stack<Integer> s, int a, int b) {
		int result;
		{
			result = b/a;
			s.push(result);

		}
	}

	public static void ifMultiplication(Stack<Integer> s, int a, int b) {
		int result;
		{
			result = (a * b);
			s.push(result);

		}
	}

	public static void ifSubtraction(Stack<Integer> s, int a, int b) {
		int result;
		{
			result = b - a;
			s.push(result);

		}
	}

	public static void ifAddition(Stack<Integer> s, int a, int b) {
		int result;
		{
			result = a + b;
			s.push(result);

		}
	}

	public static void ifNumberChangeStringToInt(String userInput, Stack<Integer> s, int i) {
		String userInputToTurnIntoInt;
		{
			userInputToTurnIntoInt = "" + userInput.charAt(i);
			int x = Integer.parseInt(userInputToTurnIntoInt);
			s.push(x);

		}
	}
}
