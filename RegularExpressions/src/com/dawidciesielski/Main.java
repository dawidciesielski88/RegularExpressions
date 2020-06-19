package com.dawidciesielski;

public class Main {

    public static void main(String[] args) {

        String string = "I'm string and I'll text to you";
        System.out.println(string);
        String youString = string.replaceAll("you", "myself");
        System.out.println(youString);

        String bla = "abc123defabc";
        System.out.println(bla.replaceAll("^abc", "YYY"));

        System.out.println(bla.matches("abc123defabc"));
        System.out.println(bla.replaceAll("[ab]", "X"));
    }
}
