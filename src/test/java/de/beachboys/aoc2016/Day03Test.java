package de.beachboys.aoc2016;

import de.beachboys.Day;
import de.beachboys.DayTest;
import de.beachboys.IOHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class Day03Test extends DayTest {

    private final Day day = new Day03();

    private static Stream<Arguments> provideTestDataForPart1() {
        return Stream.of(
                Arguments.of(List.of("5 10 25"), 0, null),
                Arguments.of(List.of(" 10 20  25"), 1, null)

        );
    }

    private static Stream<Arguments> provideTestDataForPart2() {
        return Stream.of(
                Arguments.of(List.of("101 301 501",
                        "102 302 502",
                        "103 303 503",
                        "201 401 601",
                        "202 402 602",
                        "203 403 603"), 6, null)

        );
    }

    @ParameterizedTest
    @MethodSource("provideTestDataForPart1")
    public void testPart1(List<String> input, Object expected, IOHelper io) {
        testPart1(this.day, input, expected, io);
    }

    @ParameterizedTest
    @MethodSource("provideTestDataForPart2")
    public void testPart2(List<String> input, Object expected, IOHelper io) {
        testPart2(this.day, input, expected, io);
    }

}