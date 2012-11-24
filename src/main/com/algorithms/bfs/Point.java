package com.algorithms.bfs;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object that) {
        if ((that == null) || (getClass() != that.getClass())) {
            return false;
        }

        Point other = (Point) that;
        if ((x != other.x) || (y != other.y)) {
            return false;
        }

        return true;
    }
}
