package de.beachboys.aoc2016;

import de.beachboys.Day;
import de.beachboys.DayTest;
import de.beachboys.IOHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class Day07Test extends DayTest {

    private final Day day = new Day07();

    private static Stream<Arguments> provideTestDataForPart1() {
        return Stream.of(
                Arguments.of(List.of("abba[mnop]qrst",
                        "abcd[bddb]xyyx",
                        "aaaa[qwer]tyui",
                        "ioxxoj[asdfgh]zxcvbn"), 2, null)

        );
    }

    private static Stream<Arguments> provideTestDataForPart2() {
        return Stream.of(
                Arguments.of(List.of("aba[bab]xyz",
                        "xyx[xyx]xyx",
                        "aaa[kek]eke",
                        "zazbz[bzb]cdb"), 3, null)

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