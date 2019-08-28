package Programs;
public class FactorialRecursion {

	public static void main(String[] arg) {
		int number = 4;
		int result;
		result = factorial(number);
		System.out.println(number + " factorial : " + result);
	}

	 static int factorial(int n) {
		if (n != 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
}
