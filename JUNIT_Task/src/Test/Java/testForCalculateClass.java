import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;


public class testForCalculateClass {

    @DisplayName("positiveMultiply")
    @ParameterizedTest(name = "{index} => input=''{0}, {1}''")
    @CsvSource({ "4, 5", "5, 7", "5, 15" })
    void positiveMultiply(double number1, double number2) {
        double expectedResult = number1 * number2;
        double methodResult = Calculate.multiply(number1, number2);
        assertThat(methodResult, CoreMatchers.<Double>is(expectedResult));
    }

    @DisplayName("negativeMultiply")
    @ParameterizedTest(name = "{index} => input=''{0}, {1}''")
    @CsvSource({ "-1, 5", "-1, 7", "111, 15" })
    void negativeMultiply(double number1, double number2) {
        double expectedResult = 0;
        double methodResult = Calculate.multiply(number1, number2);
        assertThat(methodResult, CoreMatchers.<Double>is(expectedResult));
    }

    @DisplayName("negativeMultiply")
    @ParameterizedTest(name = "{index} => input=''{0}, {1}''")
    @MethodSource("twoValidImputs")
    void negativeValueSourceMultiply(double number1, double number2) {
        double expectedResult = number1 * number2;
        double methodResult = Calculate.multiply(number1, number2);
        assertThat(methodResult, CoreMatchers.<Double>is(expectedResult));
    }

    @MethodSource("twoValidInputs")
    private static Stream<Arguments> twoValidImputs() {
        return Stream.of(
                Arguments.of(-1, 5),
                Arguments.of(6, 7));
    }


}
