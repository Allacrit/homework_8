package lesson_8.calc;

import java.util.Stack;

public class MathParse {
    public static Stack<Double> numbers = new Stack<>();
    private static String mathPostfix;

    public static double eval(String mathInfix) {
        mathPostfix = InfixToPosfix.convert(mathInfix);
        var mathArr = mathPostfix.split("\s+");

        for (String mathElement : mathArr) {
            if (InfixToPosfix.isNumeric(mathElement)) {
                numbers.push(Double.parseDouble(mathElement));
                continue;
            }
            double num2 = numbers.pop();
            double num1 = numbers.pop();

            numbers.push(calc (num1, num2, mathElement));
        }

        return numbers.pop();
    }

    private static double calc(double num1, double num2,String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "^" -> Math.pow(num1,num2);
            default -> 0;
        };
    }
}
