import java.util.Stack;

public class Calc {

	public static void main(String args[]) {
		Calc c = new Calc();
		Double result = c.evaluate("");
		System.out.println("Result: " + result);
		result = c.evaluate("1 3 *");
		System.out.println("Result: " + result);
	}

	public double evaluate(String expr) {
		if (expr.isEmpty()) {
			return 0;
		}
		Stack<String> notation = new Stack<>();
		String[] exprSplit = expr.split("\\s+");
		System.out.println("exprSplit: " + exprSplit.toString());
		for (int i = exprSplit.length - 1; i >= 0; i--) {
			String x = exprSplit[i];
			if (x.matches("[-+*/]")) {
				double a = Double.parseDouble(notation.pop());
				double b = Double.parseDouble(notation.pop());
				notation.push(String.valueOf(operate(x, a, b)));

			} else if (x.matches("[0-9]")) {
				notation.push(x);
			}
		}
		return Double.parseDouble(notation.pop());
	}

	public double operate(String operator, Double a, Double b) {
		double result;
		switch (operator) {
		case "-":
			result = b - a;
			break;
		case "+":
			result = b + a;
			break;
		case "*":
			result = b * a;
			break;
		case "/":
			result = b / a;
			break;
		default:
			result = 0;
			break;
		}
		return result;
	}
}