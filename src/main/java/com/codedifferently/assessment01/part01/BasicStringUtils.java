package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        char[]sentence = str.toCharArray();
        for(int i =0;i<sentence.length;i++){
            if(i==0){
               sentence[i]= Character.toUpperCase(sentence[i]);
            }
            Character.toLowerCase(sentence[i]);
            if(str.charAt(i)==' '){
                sentence[i+1]=Character.toUpperCase(sentence[i+1]);
            }
        }
        String result = String.valueOf(sentence);
        return result.replaceAll("\\s","");


    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        return builder.reverse().toString();
        }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        StringBuilder builder =new StringBuilder();
        builder.append(str);
        String newStr =builder.reverse().toString();
        char[]sentence = newStr.toCharArray();
        for(int i =0;i<sentence.length-1;i++){
            if(i==0){
                sentence[i]= Character.toUpperCase(sentence[i]);
            }
            Character.toLowerCase(sentence[i]);
            if(str.charAt(i)==' '){
                sentence[i+1]=Character.toUpperCase(sentence[i+1]);
            }
        }
        String result = String.valueOf(sentence).replaceAll("\\s","");
        return result;



    }

    public static String removeFirstAndLastCharacter(String str){
        StringBuilder builder =new StringBuilder();
        builder.append(str);
        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
