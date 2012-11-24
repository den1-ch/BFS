package com.algorithms.bfs;

import static com.algorithms.bfs.Moves.down;
import static com.algorithms.bfs.Moves.left;
import static com.algorithms.bfs.Moves.right;
import static com.algorithms.bfs.Moves.up;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovesTest {
    private static final Point testPoint = new Point(1, 2);

    @Test
    public void shouldReturnNewPointAndXcordinatetLesserOnOnePointWhenLeftMove() {
        assertEquals(new Point(0, 2), left(testPoint));
    }

    @Test
    public void shouldReturnNewPointAndXcordinatetBiggerOnOnePointWhenRightMove() {
        assertEquals(new Point(2, 2), right(testPoint));
    }

    @Test
    public void shouldReturnNewPointAndYcordinatetLesserOnOnePointWhenUpMove() {
        assertEquals(new Point(1, 1), up(testPoint));
    }

    @Test
    public void shouldReturnNewPointAndYcordinatetBiggerOnOnePointWhenDownMove() {
        assertEquals(new Point(1, 3), down(testPoint));
    }
}
