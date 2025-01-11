package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void wordSubsetsTest() {

        String[] words11 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words12 = new String[] {"e","o"};

        String[] answer1= new String[] {"facebook","google","leetcode"};

        assertArrayEquals(answer1, LeetCodeAttempt.wordSubsets(words11, words12));

        String[] words21 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words22 = new String[] {"l","e"};

        String[] answer2= new String[] {"apple","google","leetcode"};

        assertArrayEquals(answer2, LeetCodeAttempt.wordSubsets(words21, words22));

    }

}
