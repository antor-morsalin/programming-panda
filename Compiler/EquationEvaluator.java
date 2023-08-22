import java.util.*;
public class EquationEvaluator {
    /*  public static void main(String[] args) {
        String equation = "{3-10 * (43-3 + 4)- 6/5} + 3";
        double result = evaluateEquation(equation);
        System.out.println(result);
    }
    */

    public static double evaluateEquation(String equation) {
        Stack<Double> operands = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (Character.isDigit(c)) {
                double num = c - '0';
                while (i + 1 < equation.length() && Character.isDigit(equation.charAt(i + 1))) {
                    num = num * 10 + equation.charAt(i + 1) - '0';
                    i++;
                }
                operands.push(num);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    double result = applyOperator(operators.pop(), operands.pop(), operands.pop());
                    operands.push(result);
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.empty() && hasPrecedence(c, operators.peek())) {
                    double result = applyOperator(operators.pop(), operands.pop(), operands.pop());
                    operands.push(result);
                }
                operators.push(c);
            }
        }

        while (!operators.empty()) {
            double result = applyOperator(operators.pop(), operands.pop(), operands.pop());
            operands.push(result);
        }

        return operands.pop();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private static double applyOperator(char operator, double b, double a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}
