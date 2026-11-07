package calculator;

import java.util.logging.Logger;

public class Calculator {

private static final Logger logger =
        Logger.getLogger(Calculator.class.getName());

public int add(int a, int b) {
    return a + b;
}

public int subtract(int a, int b) {
    return a - b;
}

public int multiply(int a, int b) {
    return a * b;
}

public int divide(int a, int b) {
    return a / b;
}

public static void main(String[] args) {
    Calculator c = new Calculator();

    logger.info("Addition: " + c.add(10, 5));
    logger.info("Subtraction: " + c.subtract(10, 5));
    logger.info("Multiplication: " + c.multiply(10, 5));
    logger.info("Division: " + c.divide(10, 5));
}

}