package com.ben.toontown.cogs.Sellbots;

import java.util.ArrayList;

/**
 * Created by Darwin on 3/26/2017.
 */
public class Telemarketer {

    public static void startingBattlePhrases(String args[]){
        ArrayList<String> phrase = new ArrayList<String>();

        phrase.add("I plan on making this inconvenient for you.");
        phrase.add("I'm prepared to close this deal quickly.");
        phrase.add("This a bad time? Good.");
        phrase.add("You should have missed my call.");
        phrase.add("I will be reversing the charges for this call.");
        phrase.add("Can I interest you in an insurance plan?");
        phrase.add("I was planning on running into you.");
        phrase.add("Too bad for you, I make house calls.");
        phrase.add("I'm going to use up a lot of your resources.");
        phrase.add("I have some costly items for you today.");
        phrase.add("You can't get rid of me now!");
        phrase.add("You can't get away from me now!");
        phrase.add("Surprised to hear from me?");
        phrase.add("Caller ID can't stop me.");

    }

    public static int minLevel = 8;
    public static int maxLevel = 12;

}
