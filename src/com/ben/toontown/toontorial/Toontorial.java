package com.ben.toontown.toontorial;

import com.ben.toontown.TasklineHelper;
import com.ben.toontown.Util;
import com.ben.toontown.playgrounds.Playground;
import com.ben.toontown.toons.Toon;
import com.ben.toontown.toontasks.GlobalToonTasks;
import javafx.concurrent.Task;

import java.util.Scanner;

/**
 * Created by ben on 3/25/17.
 */
public class Toontorial {

    private static final Scanner READER = new Scanner(System.in);

    private Toon player;

    private TasklineHelper task;


    public Toontorial(Toon player) {
        this.player = player;
    }

    Util util = new Util();
    private int jellybeanCount;


    public void startToontorial() {

        writeMickeyAndTomDialog();
        promptWhatToDo();
        // By now the task has been completed.
    }

    private void writeMickeyAndTomDialog() {
        Util.printAnimatedText("\n\tYou and Mickey Mouse enter the Toontorial.\n");
        System.out.printf("%n");
        writeMickey("Toontown has a new citizen! Do you have some extra gags?");
        writeTom("Sure, Mickey!");
        writeMickey("Tutorial Tom will tell you all about the Cogs.");
        writeMickey("Gotta go!");
        System.out.printf("%n");
        Util.printAnimatedText("\tMickey exits the scene.");
        System.out.printf("%n");
        writeTom("Cogs are evil business robots trying to take over Toontown.");
        writeTom("There are many different types of cogs...");
        writeTom("...and they turn happy buildings...");
        writeTom("...into ugly Cog buildings!");
        writeTom("But cogs can't take a joke!");
        writeTom("A good gag will stop them.");
        writeTom("There are a lot of gags, but take these to start.");
        System.out.printf("%n");
        Util.printAnimatedText("\tTutorial Tom gives you 1 cupcake and 1 squirting flower.");
        System.out.printf("%n");
        writeTom("Oh! You'll also need a Laff meter!");
        writeTom("If your Laff meter gets too low, you'll be sad!");
        writeTom("A happy toon is a healthy toon!");
        System.out.printf("%n");
        Util.printAnimatedText("\tTutorial Tom notices a Flunky Cog outside his shop.");
        System.out.printf("%n");
        writeTom("OH NO! There's a Cog outside my shop!");
        writeTom("HELP ME, PLEASE! Defeat that Cog!");
        writeTom("Here is your first ToonTask!");
        player.setCurrentToonTask(GlobalToonTasks.toonTasks.get(0)); // 0 is defeat a Flunky.
        System.out.printf("%n");
        Util.printAnimatedText("\tToonTask: " + player.getCurrentToonTask().getTaskTitle());
        System.out.printf("%n");
        writeTom("Hurry up! Go defeat that Flunky!");
        System.out.printf("%n");
    }


    private void hqDialog() {
        Util.printAnimatedText("You enter the ToonHQ.");
        System.out.printf("%n");
        writeHQHarry("Hello! Welcome to the toon HQ!");
        writeHQHarry("Great work defeating that flunky. Here's your reward.");
        System.out.printf("%n");
        Util.printAnimatedText("\tHQ Harry gives you a Schticker Book");
        System.out.printf("%n");
        writeHQHarry("This book, a Schticker book, is full of great stuff.");
        writeHQHarry("If you ever want to open it and teleport to a playground, just say schticker.");
        writeHQHarry("The curreny in toontown is Jellybeans. I will give you 5 to start out with.");
        util.jellybeans(5);
        jellybeanCount = util.getJellybeans(); // here
        Util.printAnimatedText("\tYou now have " + jellybeanCount + " jellybeans!");
        System.out.printf("%n");
        System.out.printf("%n");
        writeHQHarry("Here's your next toontask. Ride the trolley.");
        writeHQHarry("There's another TOONHQ in Toontown Central you can visit any time! Head out the doors to visit Toontown Central.");
    }

    private void writeTom(String text) {
        System.out.print("Tutorial Tom: ");
        Util.printAnimatedText(text);
        Util.sleep(750);
    }

    private void writeMickey(String text) {
        System.out.print("Mickey: ");
        Util.printAnimatedText(text);
        Util.sleep(750);
    }

    private void writeHQHarry(String text) {
        System.out.print("HQ Harry: ");
        Util.printAnimatedText(text);
        Util.sleep(750);
    }

    private void promptWhatToDo() {
        System.out.printf("[1] Exit Tutorial Tom's shop.%n");
        System.out.printf("[2] Speak to Tutorial Tom.%n");
        System.out.printf("[3] Display your ToonTask.%n");

        while (true) {
            System.out.print("What would you like to do? ");
            if (READER.hasNextInt()) {
                switch (READER.nextInt()) {
                    case 1: {
                        exitTutorialTomsShop();
                        return;
                    }
                    case 2: {
                        System.out.printf("%n");
                        writeTom(String.format("Hey %s, complete your ToonTask.", player.getName()));
                        System.out.printf("%n");
                        break;
                    }
                    case 3: {
                        System.out.printf("%n");
                        Util.printAnimatedText("\tToonTask: " + player.getCurrentToonTask().getTaskTitle());
                        System.out.printf("%n");
                        break;
                    }
                    default: {
                        break;
                    }
                }
                READER.nextLine();
            }
        }
    }

    private void exitTutorialTomsShop() {
        System.out.printf("%n");
        Util.printAnimatedText("\tYou exit Tutorial Tom's Shop and enter onto the street.");
        System.out.printf("%n[1] Search for cogs.%n");
        while (true) {
            System.out.printf("What would you like to do? ");
            if (READER.hasNextInt()) {
                switch (READER.nextInt()) {
                    case 1: {
                        searchForCogs();
                        return;
                    }
                    default:
                        break;
                }
            }
            READER.nextLine();
        }
    }

    private void searchForCogs() {
        System.out.printf("%n");
        Util.printAnimatedText("\tYou search around for cogs and found the following cogs:      \t\tFlunky Lvl 1");
        System.out.printf("%n");
        System.out.printf("[1] Battle the Flunky.%n");
        System.out.printf("[2] Flee.%n");
        while (true) {
            System.out.print("What would you like to do? ");
            if (READER.hasNextInt()) {
                switch (READER.nextInt()) {
                    case 1: {
                        battleFlunky();
                        return;
                    }
                    case 2: {
                        System.out.printf("%n\tYou cannot flee from the Toontorial!%n%n");
                    }
                    default:
                        break;
                }
            }
            READER.nextLine();
        }
    }

    private int health = 10;
    private int gagDamage = 5;

    private void setHealth() {
        health = health - gagDamage;
    }

    private void battleFlunky() {

        System.out.printf("%n");
        Util.printAnimatedText("You walk into a Flunky");
        System.out.printf("%n");
        System.out.printf("[1] Cupcake%n");
        System.out.printf("[2] Squirting Flower%n");

        while (true) {
            System.out.printf("What would you like to do?");
            if (READER.hasNextInt()) {
                switch (READER.nextInt()) {
                    case 1: {
                        setHealth();
                        System.out.printf("You chose throw! The cog now has " + health + " health!");
                        if (health <= 0) {
                            defeatCog();
                        } else {
                            nextGag();
                        }
                    }

                    case 2: {
                        setHealth();
                        System.out.printf("You chose squirt! The cog now has " + health + " health!");
                        if (health <= 0) {
                            defeatCog();
                        }
                        if(health > 0){
                            nextGag();
                        }

                    }
                }

            }
        }

    }

    private void nextGag() {
        battleFlunky();
    }

    private void defeatCog() {
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("You have defeated the flunky! Congratulations! %n");
        System.out.printf("Press 1 to Return the the toon HQ ");
        if (READER.hasNextInt()) {
            switch (READER.nextInt()){
                case 1: {
                    toonHQ();
                }
            }
        }
    }

    private void toonHQ() {
        hqDialog();
        System.out.printf("[1] Exit HQ");

        if (READER.hasNextInt()) {
            switch (READER.nextInt()) {
                case 1: {
                    finishToontorial();
                }

            }
        }

    }


    private void finishToontorial(){
        task.startTaskline();
    }

}
