package com.ben.toontown.cogs.Sellbots;

import java.util.ArrayList;

/**
 * Created by Darwin on 3/26/2017.
 */
public class MoverAndShaker {

        private void startingBattlePhrases(String args[]) {
            ArrayList<String> phrase = new ArrayList<String>();

            phrase.add("This should shake you up. %n");
            phrase.add("Prepare to be moved. %n");
            phrase.add("I feel moved to defeat you. %n");
            phrase.add("Are you shaking yet? %n");
            phrase.add("I'm ready to make my move. %n");
            phrase.add("This should be a moving moment. %n");
            phrase.add("I think it's my move. %n");
            phrase.add("Move it or lose it. &n");
            phrase.add("Watch out, Toon, you're on shaky ground. %n");
            phrase.add("You had better move out of the way. %n");
        }

        public int minLevel = 4;
        public int maxLevel = 8;


}
