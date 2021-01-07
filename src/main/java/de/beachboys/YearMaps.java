package de.beachboys;

import java.util.HashMap;
import java.util.Map;

public class YearMaps {

    public static final Map<Integer, Map<Integer, Day>> YEARS = new HashMap<>();

    static {
        buildStaticMapOfDays();
    }

    public static Day getDay(int year, int day) {
        return YEARS.get(year).get(day);
    }

    private static void buildStaticMapOfDays() {
        YEARS.put(2020, getDays2020());
        YEARS.put(2019, getDays2019());
        YEARS.put(2016, getDays2016());
        YEARS.put(2015, getDays2015());
    }

    private static Map<Integer, Day> getDays2020() {
        Map<Integer, Day> days = new HashMap<>();
        days.put(1, new de.beachboys.aoc2020.Day01());
        days.put(2, new de.beachboys.aoc2020.Day02());
        days.put(3, new de.beachboys.aoc2020.Day03());
        days.put(4, new de.beachboys.aoc2020.Day04());
        days.put(5, new de.beachboys.aoc2020.Day05());
        days.put(6, new de.beachboys.aoc2020.Day06());
        days.put(7, new de.beachboys.aoc2020.Day07());
        days.put(8, new de.beachboys.aoc2020.Day08());
        days.put(9, new de.beachboys.aoc2020.Day09());
        days.put(10, new de.beachboys.aoc2020.Day10());
        days.put(11, new de.beachboys.aoc2020.Day11());
        days.put(12, new de.beachboys.aoc2020.Day12());
        days.put(13, new de.beachboys.aoc2020.Day13());
        days.put(14, new de.beachboys.aoc2020.Day14());
        days.put(15, new de.beachboys.aoc2020.Day15());
        days.put(16, new de.beachboys.aoc2020.Day16());
        days.put(17, new de.beachboys.aoc2020.Day17());
        days.put(18, new de.beachboys.aoc2020.Day18());
        days.put(19, new de.beachboys.aoc2020.Day19());
        days.put(20, new de.beachboys.aoc2020.Day20());
        days.put(21, new de.beachboys.aoc2020.Day21());
        days.put(22, new de.beachboys.aoc2020.Day22());
        days.put(23, new de.beachboys.aoc2020.Day23());
        days.put(24, new de.beachboys.aoc2020.Day24());
        days.put(25, new de.beachboys.aoc2020.Day25());
        return days;
    }

    private static Map<Integer, Day> getDays2019() {
        Map<Integer, Day> days = new HashMap<>();
        days.put(1, new de.beachboys.aoc2019.Day01());
        days.put(2, new de.beachboys.aoc2019.Day02());
        days.put(3, new de.beachboys.aoc2019.Day03());
        days.put(4, new de.beachboys.aoc2019.Day04());
        days.put(5, new de.beachboys.aoc2019.Day05());
        days.put(6, new de.beachboys.aoc2019.Day06());
        days.put(7, new de.beachboys.aoc2019.Day07());
        days.put(8, new de.beachboys.aoc2019.Day08());
        days.put(9, new de.beachboys.aoc2019.Day09());
        days.put(10, new de.beachboys.aoc2019.Day10());
        days.put(11, new de.beachboys.aoc2019.Day11());
        days.put(12, new de.beachboys.aoc2019.Day12());
        days.put(13, new de.beachboys.aoc2019.Day13());
        days.put(14, new de.beachboys.aoc2019.Day14());
        days.put(15, new de.beachboys.aoc2019.Day15());
        days.put(16, new de.beachboys.aoc2019.Day16());
        days.put(17, new de.beachboys.aoc2019.Day17());
        days.put(18, new de.beachboys.aoc2019.Day18());
        days.put(19, new de.beachboys.aoc2019.Day19());
        days.put(20, new de.beachboys.aoc2019.Day20());
        days.put(21, new de.beachboys.aoc2019.Day21());
        days.put(22, new de.beachboys.aoc2019.Day22());
        days.put(23, new de.beachboys.aoc2019.Day23());
        days.put(24, new de.beachboys.aoc2019.Day24());
        days.put(25, new de.beachboys.aoc2019.Day25());
        return days;
    }

    private static Map<Integer, Day> getDays2016() {
        Map<Integer, Day> days = new HashMap<>();
        days.put(1, new de.beachboys.aoc2016.Day01());
        days.put(2, new de.beachboys.aoc2016.Day02());
        days.put(3, new de.beachboys.aoc2016.Day03());
        days.put(4, new de.beachboys.aoc2016.Day04());
        days.put(5, new de.beachboys.aoc2016.Day05());
        days.put(6, new de.beachboys.aoc2016.Day06());
        days.put(7, new de.beachboys.aoc2016.Day07());
        days.put(8, new de.beachboys.aoc2016.Day08());
        days.put(9, new de.beachboys.aoc2016.Day09());
        days.put(10, new de.beachboys.aoc2016.Day10());
        days.put(11, new de.beachboys.aoc2016.Day11());
        days.put(12, new de.beachboys.aoc2016.Day12());
        days.put(13, new de.beachboys.aoc2016.Day13());
        days.put(14, new de.beachboys.aoc2016.Day14());
        days.put(15, new de.beachboys.aoc2016.Day15());
        days.put(16, new de.beachboys.aoc2016.Day16());
        days.put(17, new de.beachboys.aoc2016.Day17());
        days.put(18, new de.beachboys.aoc2016.Day18());
        days.put(19, new de.beachboys.aoc2016.Day19());
        days.put(20, new de.beachboys.aoc2016.Day20());
        days.put(21, new de.beachboys.aoc2016.Day21());
        days.put(22, new de.beachboys.aoc2016.Day22());
        days.put(23, new de.beachboys.aoc2016.Day23());
        days.put(24, new de.beachboys.aoc2016.Day24());
        days.put(25, new de.beachboys.aoc2016.Day25());
        return days;
    }

    private static Map<Integer, Day> getDays2015() {
        Map<Integer, Day> days = new HashMap<>();
        days.put(1, new de.beachboys.aoc2015.Day01());
        days.put(2, new de.beachboys.aoc2015.Day02());
        days.put(3, new de.beachboys.aoc2015.Day03());
        days.put(4, new de.beachboys.aoc2015.Day04());
        days.put(5, new de.beachboys.aoc2015.Day05());
        days.put(6, new de.beachboys.aoc2015.Day06());
        days.put(7, new de.beachboys.aoc2015.Day07());
        days.put(8, new de.beachboys.aoc2015.Day08());
        days.put(9, new de.beachboys.aoc2015.Day09());
        days.put(10, new de.beachboys.aoc2015.Day10());
        days.put(11, new de.beachboys.aoc2015.Day11());
        days.put(12, new de.beachboys.aoc2015.Day12());
        days.put(13, new de.beachboys.aoc2015.Day13());
        days.put(14, new de.beachboys.aoc2015.Day14());
        days.put(15, new de.beachboys.aoc2015.Day15());
        days.put(16, new de.beachboys.aoc2015.Day16());
        days.put(17, new de.beachboys.aoc2015.Day17());
        days.put(18, new de.beachboys.aoc2015.Day18());
        days.put(19, new de.beachboys.aoc2015.Day19());
        days.put(20, new de.beachboys.aoc2015.Day20());
        days.put(21, new de.beachboys.aoc2015.Day21());
        days.put(22, new de.beachboys.aoc2015.Day22());
        days.put(23, new de.beachboys.aoc2015.Day23());
        days.put(24, new de.beachboys.aoc2015.Day24());
        days.put(25, new de.beachboys.aoc2015.Day25());
        return days;
    }

}
