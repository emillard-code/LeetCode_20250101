package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void testMaximumScoreAfterSplittingAString() {

        assertEquals(5, LeetCodeSolution.maximumScoreAfterSplittingAString("011101"));
        assertEquals(5, LeetCodeSolution.maximumScoreAfterSplittingAString("00111"));
        assertEquals(3, LeetCodeSolution.maximumScoreAfterSplittingAString("1111"));

    }

}
