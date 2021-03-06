package de.beachboys.aoc2017;

import java.util.ArrayList;
import java.util.List;

public class KnotHash {

    private int listLength = 256;
    private int skipSize = 0;
    private int currentPosition = 0;

    private List<Integer> list = new ArrayList<>();

    public KnotHash() {
        reset();
    }

    public KnotHash(int listLength) {
        this.listLength = listLength;
        reset();
    }

    public void reset() {
        list.clear();
        for (int i = 0; i < listLength; i++) {
            list.add(i);
        }
        currentPosition = 0;
        skipSize = 0;
    }

    public void knotHashRound(List<Integer> inputLengths) {
        List<Integer> oldList;
        for (Integer reverseLength : inputLengths) {
            oldList = list;
            list = new ArrayList<>(list);
            for (int i = 0; i < reverseLength; i++) {
                list.set((currentPosition + i) % listLength, oldList.get((currentPosition + reverseLength - 1 - i) % listLength));
            }
            currentPosition = (currentPosition + reverseLength + skipSize) % listLength;
            skipSize++;
        }
    }

    public String knotHashToHex(String stringToHash) {
        List<Integer> denseHash = calculateDenseHashFromString(stringToHash);
        return buildHexString(denseHash);
    }

    public String knotHashToBinary(String stringToHash) {
        List<Integer> denseHash = calculateDenseHashFromString(stringToHash);
        return buildBinaryString(denseHash);
    }

    private List<Integer> calculateDenseHashFromString(String stringToHash) {
        List<Integer> inputLengths = getInputLengthsFromString(stringToHash);
        for (int i = 0; i < 64; i++) {
            knotHashRound(inputLengths);
        }
        return buildDenseHash();
    }

    private List<Integer> buildDenseHash() {
        List<Integer> denseHash = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            denseHash.add(list.subList(i * 16, (i + 1) * 16).stream().reduce(0, (a, b) -> a ^ b));
        }
        return denseHash;
    }

    private String buildHexString(List<Integer> denseHash) {
        StringBuilder hex = new StringBuilder();
        denseHash.forEach(i -> hex.append(String.format("%02x", i)));
        return hex.toString();
    }

    private String buildBinaryString(List<Integer> denseHash) {
        StringBuilder binary = new StringBuilder();
        denseHash.forEach(i -> binary.append(String.format("%8s", Integer.toBinaryString(i)).replace(" ", "0")));
        return binary.toString();
    }


    private List<Integer> getInputLengthsFromString(String stringToHash) {
        List<Integer> inputLengths = new ArrayList<>();
        for (int character : stringToHash.toCharArray()) {
            inputLengths.add(character);
        }
        inputLengths.addAll(List.of(17, 31, 73, 47, 23));
        return inputLengths;
    }

    public List<Integer> getList() {
        return list;
    }
}
