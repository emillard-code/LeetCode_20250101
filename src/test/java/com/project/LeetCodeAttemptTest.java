package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void testMaximumScoreAfterSplittingAString() {

        assertEquals(5, LeetCodeAttempt.maximumScoreAfterSplittingAString("011101"));
        assertEquals(5, LeetCodeAttempt.maximumScoreAfterSplittingAString("00111"));
        assertEquals(3, LeetCodeAttempt.maximumScoreAfterSplittingAString("1111"));

    }

}
