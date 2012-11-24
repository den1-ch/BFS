package com.algorithms.bfs;

import static com.algorithms.bfs.Moves.down;
import static com.algorithms.bfs.Moves.right;

import java.util.ArrayList;
import java.util.List;

public class Solver {
    private final int maxX;
    private final int maxY;

    private final Point start = new Point(0, 0);
    private final Point finish;

    public Solver(int nx, int ny) {
        maxX = nx;
        maxY = ny;

        finish = new Point(maxX, maxY);
    }

    public Point startPoint() {
        return start;
    }

    public Point finishPoint() {
        return finish;
    }

    public List<Point> allLegalNeighbors(Point point) {
        List<Point> result = new ArrayList<>();
        for (Point currentPoint : new Point[] { right(point), down(point) }) {
            if (isLegal(currentPoint)) {
                result.add(currentPoint);
            }
        }
        return result;
    }

    public boolean isLegal(Point point) {
        return ((point.getX() <= maxX) && (point.getY() <= maxY));
    }


    private long countPossiblePaths(Point point, long accu) {
        if (point.equals(finish)) {
            accu = accu + 1;
        }
        return getCountPossiblePaths(point, accu);
    }

    public long getCountPossiblePaths(Point currentPoint, long accu) {
        for (Point point : allLegalNeighbors(currentPoint)) {
            accu = countPossiblePaths(point, accu);
        }
        return accu;
    }

    public static void main(String[] args) {
        System.out.print(new Solver(20, 20).countPossiblePaths(new Point(0, 0), 0));
    }

}