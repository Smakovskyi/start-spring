package ua.kpi.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Calculator")
public class CalculatorTest {

  @Nested
  @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
  class Tests_for_addition {

    @Test
    void test_add_two_and_three_receive_five() {
      Calculator calculator = new Calculator();
      int first = 2;
      int second = 3;
      final int expectedResult = 5;

      int actualResult = calculator.add(first, second);

      assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_add_two_and_three_get_last_result_five() {
      Calculator calculator = new Calculator();
      int first = 2;
      int second = 3;
      final int expectedLastResult = 5;

      calculator.add(first, second);
      int actualLastResult = calculator.getLastResult();

      assertEquals(expectedLastResult, actualLastResult);
    }
  }

  @Nested
  @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
  class Tests_for_division {
    @Test
    void test_divide_two_and_zero_raise_exception() {
      Calculator calculator = new Calculator();

      int first = 2;
      int second = 0;

      assertThrows( ArithmeticException.class ,
          () ->calculator.divide(first, second));
    }
  }



}
