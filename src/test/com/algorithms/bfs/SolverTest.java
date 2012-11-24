package com.algorithms.bfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;

public class SolverTest {
    /*
     *   1 2
     * 1 - -
     * 2 - -
     * */

    private static final int NX = 2;
    private static final int NY = 2;

    private final Solver solver = new Solver(NX, NY);

    @Test
    public void shouldReturnStartPoint() {
        assertEquals(new Point(0, 0), solver.startPoint());
    }

    @Test
    public void shouldReturnFinishPoint() {
        assertEquals(new Point(NX, NY), solver.finishPoint());
    }

    @Test
    public void shoudReturnFalseIfPointIsNotLegal() {
        assertFalse(solver.isLegal(new Point(2, 6)));
    }

    @Test
    public void shoudReturnAllLegalNeighbors() {
        assertEquals("[(2, 2)]", Arrays.toString(solver.allLegalNeighbors(new Point(2, 1)).toArray()));
    }

    @Test
    public void shouldReturnCountOfPathFromStartToFinishPoint() {
        assertEquals(6, solver.getCountPossiblePaths(solver.startPoint(), 0));
    }
}
