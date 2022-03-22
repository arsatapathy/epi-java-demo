package com.arsatapathy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenFirstTest {

    @Test
    public void test_01() {
        Assertions.assertArrayEquals(new int[]{6,2,4,5,3,1}, EvenFirst.evenFirst(new int[]{1,2,3,4,5,6}));
    }
}
