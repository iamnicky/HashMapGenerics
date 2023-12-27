package com.example.hashmapbinaryimplementation;

public class RemoveWordFromParagraph {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations";
        System.out.println(paragraph.replace("avoidable", ""));
    }
}
