package com.ben.toontown.cogs.Sellbots;

import java.util.ArrayList;

/**
 * Created by Darwin on 3/26/2017.
 */
public class NameDropper {

    public static void startingBattlePhrases(String args[]){
        ArrayList<String> phrase = new ArrayList<String>();

        phrase.add("Haven't we met before?");
        phrase.add("You name it, I've dropped it.");
        phrase.add("In my opinion, your name is mud.");
        phrase.add("Have I mentioned I know The Mingler? %n");
        phrase.add("Let's hurry, I'm having lunch with Mr. Hollywood. %n");
        phrase.add("I think I'll just drop in. %n");
        phrase.add("I'm in a mood to drop some Toons. %n");
        phrase.add("Mind if I drop your name? &n");
        phrase.add("And your name is? %n");

    }

    public static int minLevel = 3;
    public static int maxLevel = 7;

}
