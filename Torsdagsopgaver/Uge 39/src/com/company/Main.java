package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;
    static int timesFound = 0;
    static int maxNum = 0;
    static int minNum = 0;
    static String myWord = "";
    static char[] chars;
    static char myChar;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        chars = inputFromFile.toLowerCase().toCharArray();


        //System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:

        //printLongestWord(); //Task 1
        //printFirstHalfOfEachWord(); //Task 2
        printMostFrequentLetter(); //Task 3
        //printLessFrequentLetter(); //Task 4
    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    //Task 1
    private static void printLongestWord(){
        String longestWord = "";
        for (int i = 0; i < text.length; i++) {
            int textLength = text[i].length();
            if(textLength > longestWord.length()){
                longestWord = text[i];
            }
        }
        System.out.println(longestWord + "\n");
    }

    //Task 2
    private static void printFirstHalfOfEachWord(){
        for (int i = 0; i < text.length; i++) {
            int textLength = text[i].length();
            String getHalf = text[i].substring(0, textLength/2);
            System.out.println(getHalf + "\n");
        }
    }

    //Task 3
    private static void printMostFrequentLetter(){
        for(int i = 1; i < chars.length; i++){
            timesFound = 0;
            for (int j = 0; j < chars.length; j++) {
                if(chars[i] == chars[j]){
                    timesFound = timesFound + 1;
                }

                if(Character.isWhitespace(chars[i])){
                    timesFound = timesFound - 1;
                }

                if (timesFound > maxNum){
                    maxNum = timesFound;
                    myChar = chars[i];
                }
            }
        }
        System.out.println("Most repeated letter " + myChar + " is found " + maxNum + " times");
    }

    //Task 4
    private static void printLessFrequentLetter(){
        for(int i = 1; i < chars.length; i++){
            timesFound = 0;

            for (int j = 0; j < chars.length; j++) {
                if(chars[i] != chars[j]){
                    timesFound = timesFound + 1;
                }

                if(Character.isWhitespace(chars[i])){
                    timesFound = timesFound - 1;
                }

                if(!Character.isLetter(chars[i])){
                    timesFound = timesFound - 1;
                }

                if (timesFound >= maxNum){
                    maxNum = timesFound;
                    myChar = chars[i];
                }
            }
        }
        System.out.println("The least repeated letter is: " + myChar);
    }
}