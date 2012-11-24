package com.algorithms.bfs;

public class Moves {
    public static Point left(Point point) {
        return new Point(point.getX() - 1, point.getY());
    }

    public static Point right(Point point) {
        return new Point(point.getX() + 1, point.getY());
    }

    public static Point up(Point point) {
        return new Point(point.getX(), point.getY() - 1);
    }

    public static Point down(Point point) {
        return new Point(point.getX(), point.getY() + 1);
    }
}
