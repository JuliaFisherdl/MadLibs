package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
	String[] nouns = {"house","car", "bridge", "box", "tree"};
    String[] adjectives = {"blue", "funny", "smart", "humble", "silly"};
    String[] verbs = {"jumping", "walking", "running", "sleeping", "standing"};
    */
        /*
        String[] listOfNouns = new String[5];
        String[] listOfVerbs = new String[5];
        String[] listOfAdjectives = new String[5];

        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter 5 nouns: ");
        for (int i = 0; i < listOfNouns.length; i++) {
            listOfNouns[i] = userInput.next();
            }

            System.out.println("Enter 5 verbs: ");
            for (int i = 0; i < listOfVerbs.length; i++) {
                listOfVerbs[i] = userInput.next();
                }

                System.out.println("Enter 5 adjectives: ");
                for (int i = 0; i < listOfAdjectives.length; i++) {
                    listOfAdjectives[i] = userInput.next();
                }

        String story = "One day, I will visit space. I will build a rocketship that looks like a " + listOfAdjectives[rand.nextInt(5)] + " " +  listOfNouns[rand.nextInt(5)]
                + ".  I will build it next to a " + listOfNouns[rand.nextInt(5)] + "." + "  I hope to not get distracted and start " + listOfVerbs[rand.nextInt(5)]
                + " away. " + "\n" + "I don't want to risk not seeing a " + listOfNouns[rand.nextInt(5)]
                + ". I need to keep " + listOfVerbs[rand.nextInt(5)]+ " and remain " + listOfAdjectives[rand.nextInt(5)];

        System.out.println(story);
        */

        Random rand = new Random();
        List<String> listOfNouns = new ArrayList<>();
        List<String> listOfAdjectives = new ArrayList<>();
        List<String> listOfVerbs = new ArrayList<>();
        int INDEX_MAX = 5;

        /*
        listOfNouns.add("house");
        listOfNouns.add("car");
        listOfNouns.add("bridge");
        listOfNouns.add("box");
        listOfNouns.add("house");

        listOfVerbs.add("jumping");
        listOfVerbs.add("walking");
        listOfVerbs.add("running");
        listOfVerbs.add("sleeping");
        listOfVerbs.add("standing");

        listOfAdjectives.add("blue");
        listOfAdjectives.add("funny");
        listOfAdjectives.add("smart");
        listOfAdjectives.add("humble");
        listOfAdjectives.add("silly");

         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 5 nouns: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfNouns.add(userInput.next());
        }
        System.out.println("Enter 5 adjectives: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfAdjectives.add(userInput.next());
        }
        System.out.println("Enter 5 verbs: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfVerbs.add(userInput.next());

            String story = "One day, I will visit space. I will build a rocketship that looks like a " + listOfAdjectives.get(rand.nextInt(5)) + " " + listOfNouns.get(rand.nextInt(5))
                    + ".  I will build it next to a " + listOfNouns.get(rand.nextInt(5)) + "." + "  I hope to not get distracted and start " + listOfVerbs.get(rand.nextInt(5))
                    + " away. " + "\n" + "I don't want to risk not seeing a " + listOfNouns.get(rand.nextInt(5))
                    + ". I need to keep " + listOfVerbs.get(rand.nextInt(5)) + " and remain " + listOfAdjectives.get(rand.nextInt(5));

            System.out.println(story);
        }

    }
}

