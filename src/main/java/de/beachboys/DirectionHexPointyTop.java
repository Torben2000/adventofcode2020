package de.beachboys;

import org.javatuples.Triplet;

public enum DirectionHexPointyTop {

    WEST(-1, 1, 0), EAST(1, -1, 0), NORTHWEST(0, 1, -1), NORTHEAST(1, 0, -1), SOUTHWEST(-1, 0, 1), SOUTHEAST(0, -1, 1);

    public final int stepX;
    public final int stepY;
    public final int stepZ;

    DirectionHexPointyTop(int stepX, int stepY, int stepZ) {
        this.stepX = stepX;
        this.stepY = stepY;
        this.stepZ = stepZ;
    }

    public static DirectionHexPointyTop fromString(String directionString) {
        switch (directionString.toLowerCase()) {
            case "e":
            case "east":
                return DirectionHexPointyTop.EAST;
            case "ne":
            case "northeast":
                return DirectionHexPointyTop.NORTHEAST;
            case "se":
            case "southeast":
                return DirectionHexPointyTop.SOUTHEAST;
            case "w":
            case "west":
                return DirectionHexPointyTop.WEST;
            case "sw":
            case "southwest":
                return DirectionHexPointyTop.SOUTHWEST;
            case "nw":
            case "northwest":
                return DirectionHexPointyTop.NORTHWEST;
            default:
                throw new IllegalArgumentException();
        }
    }

    public Triplet<Integer, Integer, Integer> move(Triplet<Integer, Integer, Integer> currentPosition, int distance) {
        return Triplet.with(currentPosition.getValue0() + distance * stepX, currentPosition.getValue1() + distance * stepY, currentPosition.getValue2() + distance * stepZ);
    }

    public DirectionHexPointyTop turn(boolean left) {
        if (left) {
            return turnLeft();
        }
        return turnRight();
    }

    public DirectionHexPointyTop turnLeft() {
        switch (this) {
            case NORTHWEST:
                return WEST;
            case WEST:
                return SOUTHWEST;
            case SOUTHWEST:
                return SOUTHEAST;
            case SOUTHEAST:
                return EAST;
            case EAST:
                return NORTHEAST;
            case NORTHEAST:
                return NORTHWEST;
        }
        throw new IllegalStateException();
    }

    public DirectionHexPointyTop turnRight() {
        switch (this) {
            case NORTHWEST:
                return NORTHEAST;
            case WEST:
                return NORTHWEST;
            case SOUTHWEST:
                return WEST;
            case SOUTHEAST:
                return SOUTHWEST;
            case EAST:
                return SOUTHEAST;
            case NORTHEAST:
                return EAST;
        }
        throw new IllegalStateException();
    }

    public DirectionHexPointyTop getOpposite() {
        switch (this) {
            case WEST:
                return EAST;
            case NORTHWEST:
                return SOUTHEAST;
            case SOUTHWEST:
                return NORTHEAST;
            case EAST:
                return WEST;
            case SOUTHEAST:
                return NORTHWEST;
            case NORTHEAST:
                return SOUTHWEST;
        }
        throw new IllegalStateException();
    }

}
