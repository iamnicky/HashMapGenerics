package com.example.hashmapbinaryimplementation;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordFrequencyCount {
    private static String[] cleanAndSplitText(String text) {
        String cleanText = text.replace(".", "").replace("?", "").toLowerCase(Locale.ROOT);
        return cleanText.split("\\s");

    }

    public static void main(String[] args) {
        String text = "To be or Not to be";
        String[] words = cleanAndSplitText(text);
        Map<String, Integer> wordCountmap = new HashMap<>();

        for (String word : words) {
            wordCountmap.put(word, wordCountmap.getOrDefault(word, 0)+1);
        }
        System.out.println("Word Count: ");
        for(Map.Entry<String, Integer>  entry: wordCountmap.entrySet()){
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
    }
}
