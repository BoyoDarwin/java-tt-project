package com.ben.toontown;

import com.ben.toontown.makeatoon.MakeAToon;
import com.ben.toontown.toons.Toon;
import com.ben.toontown.toontasks.GlobalToonTasks;
import com.ben.toontown.toontorial.Toontorial;



public class Main {


    private static Toon player;

    public static void main(String[] args) {
        createGameObjects();

        player = new MakeAToon().CreateAToon();
        if(Util.playerWantsToontorial()){
            new Toontorial(player).startToontorial();
        }
        player.getCurrentPlayground().enter();
        Util.printMainOptions(player);
    }

    public static void createGameObjects(){
        PlaygroundHelper.createPlaygrounds();
        GlobalToonTasks.createGlobalToonTasks();
    }


}
