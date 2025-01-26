package com.project.attempt;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        String[] words11 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words12 = new String[] {"e","o"};

        System.out.println(Arrays.toString(wordSubsets(words11, words12)));

        String[] words21 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words22 = new String[] {"l","e"};

        System.out.println(Arrays.toString(wordSubsets(words21, words22)));

        String[] words31 = new String[] {"maple","apple","el dorado","google","leetcode"};
        String[] words32 = new String[] {"le","a"};

        System.out.println(Arrays.toString(wordSubsets(words31, words32)));


    }

    // This method returns an array of all universal strings from word1[] as per challenge specifications.
    public static String[] wordSubsets(String[] words1, String[] words2) {

        // We will hold our list of universal strings in this array.
        ArrayList<String> answerList = new ArrayList<>();

        // We will loop through every string in words1[] and perform the appropriate logic on it.
        // We set the boolean universal to true initially, and set false if at any point a string
        // in words2[] turns out to not be a subset of words1[i] at some index i.
        for (int i = 0; i < words1.length; i++) {

            String a = words1[i];
            boolean universal = true;

            // For every string in words1[], we will compare it to every string in words2[]
            // so as to make sure that every string in words2[] is a subset of it. We will use
            // a StringBuilder version of words1[i] to help test for subsets as it is more mutable.
            for (int j = 0; j < words2.length; j++) {

                String b = words2[j];
                StringBuilder words1Builder = new StringBuilder(a);

                // We will go through every character in words2[j], and gradually delete those
                // characters off of StringBuilder words1Builder. If at any point there is a
                // character in words2[j] that doesn't or no longer exists in words1Builder,
                // then that means words2[j] is not a subset of words1[i]. So we set boolean
                // universal as false. However, if every character that exists in words2[j]
                // (including duplicate characters) can be deleted off of StringBuilder
                // words1Builder, then that means words2[j] is a subset of words1[i] and we
                // can add it to the answer array later.
                for (int k = 0; k < b.length(); k++) {

                    String currentCharacter = String.valueOf(b.charAt(k));

                    if (words1Builder.indexOf(currentCharacter) != -1) {
                        words1Builder.deleteCharAt(words1Builder.indexOf(currentCharacter));
                    } else if (words1Builder.indexOf(currentCharacter) == -1) {
                        universal = false;
                    }

                }

            }

            // If universal was not set false at any point in the current loop,
            // we can safely assume words1[i] is universal.
            if (universal) { answerList.add(words1[i]); }

        }

        // Once we complete looping through all the strings and testing them all,
        // we return the list of strings that were indicated to be universal.
        return answerList.toArray(new String[0]);

    }

}
