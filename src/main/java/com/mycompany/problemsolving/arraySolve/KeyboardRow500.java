package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow500 {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> validWords = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
//            if(words==row1)
//                validWords.add(lowerWord);
            if(word.equals(row1) || word.equals(row2) || word.equals(row3))
                validWords.add(word);
                validWords.add(word);
            }
        System.out.println(validWords);
        }
    }

