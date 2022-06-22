package com.codedifferently.assessment01.part01;

import java.util.ArrayList;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        String[]words = sentence.split("\\s");
        return words;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        StringBuilder builder = new StringBuilder();
        builder.append(sentence);
        String blank =" ";
        return builder.substring(0,builder.indexOf(blank));
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String blank =" ";
        builder.append(sentence);
        String firstWord = builder.substring(0,builder.indexOf(blank));
        result.append(firstWord);
        return result.reverse().toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        StringBuilder builder = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        StringBuilder camelCase= new StringBuilder();
        String blank =" ";
        builder.append(sentence);
        String firstWord = builder.substring(0,builder.indexOf(blank));
        reverse.append(firstWord);
        camelCase.append(reverse.reverse());
        char firstCharacter = camelCase.charAt(0);
        char lastCharacter = camelCase.charAt(camelCase.length()-1);

        return Character.toUpperCase(firstCharacter) +
                camelCase.substring(1,camelCase.length()-1)+
                Character.toLowerCase(lastCharacter);




    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder builder= new StringBuilder();
        builder.append(str);
        builder.deleteCharAt(index);
        return builder.toString();

    }


}
