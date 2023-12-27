package com.example.hashmapbinaryimplementation;

import java.util.*;

public class ParagraphWordFrequencyCount {


    public static void main(String[] args) {
        String paragraph = "Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations";
        String[] lines = paragraph.split("\\R");
        ArrayList<String> words=new ArrayList<>();
        for(String entry: lines){
            Collections.addAll(words, cleanAndSplitText(entry));
        }
        Map<String, Integer> wordCountmap = new HashMap<>();

        for (String word : words) {
            wordCountmap.put(word, wordCountmap.getOrDefault(word, 0)+1);
        }
        System.out.println("Word Count: ");
        for(Map.Entry<String, Integer>  entry: wordCountmap.entrySet()){
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
    }

    private static String[] cleanAndSplitText(String text) {
        String cleanText = text.replace(".", "").replace("?", "").toLowerCase(Locale.ROOT);
        return cleanText.split("\\s");

    }

}
