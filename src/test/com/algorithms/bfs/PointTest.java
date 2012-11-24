package com.algorithms.bfs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
    private static final Point testPoint = new Point(2, 1);

    @Test
    public void shoudReturnHisPostion() {
        assertEquals("(2, 1)", testPoint.toString());
    }

}
