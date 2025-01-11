package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolutionTest {

    @Test
    public void wordSubsetsTest() {

        String[] words11 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words12 = new String[] {"e","o"};

        List<String> answer1 = new ArrayList<String>();
        answer1.add("facebook");
        answer1.add("google");
        answer1.add("leetcode");

        assertIterableEquals(answer1, LeetCodeSolution.wordSubsets(words11, words12));

        String[] words21 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words22 = new String[] {"l","e"};

        List<String> answer2 = new ArrayList<String>();
        answer2.add("apple");
        answer2.add("google");
        answer2.add("leetcode");

        assertIterableEquals(answer2, LeetCodeSolution.wordSubsets(words21, words22));

    }

}
