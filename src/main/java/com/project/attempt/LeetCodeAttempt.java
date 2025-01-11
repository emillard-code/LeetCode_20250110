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

    public static String[] wordSubsets(String[] words1, String[] words2) {

        ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < words1.length; i++) {

            String a = words1[i];
            boolean universal = true;

            for (int j = 0; j < words2.length; j++) {

                String b = words2[j];
                StringBuilder words1Builder = new StringBuilder(a);

                for (int k = 0; k < b.length(); k++) {

                    String currentCharacter = String.valueOf(b.charAt(k));

                    if (words1Builder.indexOf(currentCharacter) != -1) {
                        words1Builder.deleteCharAt(words1Builder.indexOf(currentCharacter));
                    } else if (words1Builder.indexOf(currentCharacter) == -1) {
                        universal = false;
                    }

                }

            }

            if (universal) { answerList.add(words1[i]); }

        }

        return answerList.toArray(new String[0]);

    }

}
