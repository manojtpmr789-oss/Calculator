package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

Calculator c = new Calculator();

@Test
void testAdd() {
    assertEquals(15, c.add(10, 5));
}

@Test
void testSubtract() {
    assertEquals(5, c.subtract(10, 5));
}

@Test
void testMultiply() {
    assertEquals(50, c.multiply(10, 5));
}

@Test
void testDivide() {
    assertEquals(2, c.divide(10, 5));
}

@Test
void testAddZero() {
    assertEquals(10, c.add(10, 0));
}

@Test
void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
}

}