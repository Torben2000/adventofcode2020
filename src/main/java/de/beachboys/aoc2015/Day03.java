package de.beachboys.aoc2015;

import de.beachboys.Day;
import org.javatuples.Pair;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day03 extends Day {

    public Object part1(List<String> input) {
        Set<Pair<Integer, Integer>> houses = new HashSet<>();
        int x = 0;
        int y = 0;
        houses.add(Pair.with(x, y));
        String calls = input.get(0);
        for (int i = 0; i < calls.length(); i++) {
            switch (calls.charAt(i)) {
                case '^':
                    y -= 1;
                    break;
                case 'v':
                    y += 1;
                    break;
                case '<':
                    x -= 1;
                    break;
                case '>':
                    x += 1;
                    break;
            }
            houses.add(Pair.with(x, y));
        }
        return houses.size();
    }

    public Object part2(List<String> input) {
        Set<Pair<Integer, Integer>> houses = new HashSet<>();
        int x = 0;
        int y = 0;
        int roboX = 0;
        int roboY = 0;
        houses.add(Pair.with(x, y));
        String calls = input.get(0);
        boolean isSanta = true;
        for (int i = 0; i < calls.length(); i++) {
            if (isSanta) {
                switch (calls.charAt(i)) {
                    case '^':
                        y -= 1;
                        break;
                    case 'v':
                        y += 1;
                        break;
                    case '<':
                        x -= 1;
                        break;
                    case '>':
                        x += 1;
                        break;
                }
                houses.add(Pair.with(x, y));
            } else {
                switch (calls.charAt(i)) {
                    case '^':
                        roboY -= 1;
                        break;
                    case 'v':
                        roboY += 1;
                        break;
                    case '<':
                        roboX -= 1;
                        break;
                    case '>':
                        roboX += 1;
                        break;
                }
                houses.add(Pair.with(roboX, roboY));
            }
            isSanta = !isSanta;
        }
        return houses.size();
    }

}
