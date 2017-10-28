package com.ben.toontown.cogs.Sellbots;

import java.util.ArrayList;

/**
 * Created by Darwin on 3/26/2017.
 */
public class TheMingler {

    public static void startingBattlePhrases(String args[]){
        ArrayList<String> phrase = new ArrayList<String>();

        phrase.add("Are you sure you're ready to mingle?");
        phrase.add("You don't know who you're mingling with.");
        phrase.add("I'm going to mingle in your business.");
        phrase.add("Ever mingle with the likes of me?");
        phrase.add("You're mingling with defeat.");
        phrase.add("Let's mingle.");
        phrase.add("This looks like a good place to mingle.");
        phrase.add("Well, isn't this cozy?");
        phrase.add("Good, it takes two to mingle.");

    }

    public static int minLevel = 7;
    public static int maxLevel = 11;

}
