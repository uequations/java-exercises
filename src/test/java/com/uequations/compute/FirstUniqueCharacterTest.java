package com.uequations.compute;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterTest {

    @Test
    public void applyLeetCode() {
        String input = "leetcode";

        assertEquals(0, (int) new FirstUniqueCharacter().apply(input));
    }

    @Test
    public void applyLoveLeetCode() {
        String input = "loveleetcode";

        assertEquals(2, (int) new FirstUniqueCharacter().apply(input));
    }

    @Test
    public void applyAABB() {
        String input = "aabb";

        assertEquals(-1, (int) new FirstUniqueCharacter().apply(input));
    }
}