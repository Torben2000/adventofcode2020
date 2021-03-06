package de.beachboys.aoc2017;

import de.beachboys.Day;
import de.beachboys.DayTest;
import de.beachboys.IOHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class Day01Test extends DayTest {

    private final Day day = new Day01();

    private static Stream<Arguments> provideTestDataForPart1() {
        return Stream.of(
                Arguments.of(List.of("1122"), 3, null),
                Arguments.of(List.of("1111"), 4, null),
                Arguments.of(List.of("1234"), 0, null),
                Arguments.of(List.of("91212129"), 9, null)
        );
    }

    private static Stream<Arguments> provideTestDataForPart2() {
        return Stream.of(
                Arguments.of(List.of("1212"), 6, null),
                Arguments.of(List.of("1221"), 0, null),
                Arguments.of(List.of("123425"), 4, null),
                Arguments.of(List.of("123123"), 12, null),
                Arguments.of(List.of("12131415"), 4, null)
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