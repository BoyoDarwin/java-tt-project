package com.ben.toontown.cogs.Sellbots;

import java.util.ArrayList;

/**
 * Created by Darwin on 3/26/2017.
 */
public class TwoFace {

    public static void startingBattlePhrases(String args[]){
        ArrayList<String> phrase = new ArrayList<String>();

        phrase.add("Two heads are better than one.");
        phrase.add("It takes two to tango, you wanna tango?");
        phrase.add("Are you ready to face your doom?");
        phrase.add("Which face would you like to defeat you?");
        phrase.add("Prepare to face your worst nightmare.");
        phrase.add("Face it, I'm better than you.");
        phrase.add("I'm 'two' much for you.");
        phrase.add("You don't know who you're facing.");
        phrase.add("It's time to face-off!");
        phrase.add("You're in for two times the trouble.");
        phrase.add("You better face up to defeat.");

    }

    public static int minLevel = 6;
    public static int maxLevel = 10;

}
