package com.ben.toontown.cogs.Sellbots;

import com.ben.toontown.Util;
import com.ben.toontown.cogs.Attack;
import com.ben.toontown.toons.Toon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Darwin on 3/26/2017.
 */
public class ColdCaller extends Sellbot{

    public static ArrayList<String> startingBattlePhrasesArrayList = new ArrayList<String>(){{
        add("Boy, did you get your wires crossed. %n");
        add("I was hoping you'd answer my call. %n");
        add("You rang? %n");
        add("I'm going to cause a ringing sensation. %n");
        add("This call is going to cost you. %n");
        add("You've got big trouble on the line. %n");
        add("Surprised to hear from me? %n");
        add("Are you ready to accept my charges? &n");
        add("This caller always collects. %n");
        add("I'm one smooth operator. %n");
        add("Hold the phone -- I'm here. %n");
        add("Have you been waiting for my call? %n");
        add("I always make my calls direct. %n");
    }};

    public static ArrayList<Attack> attackArrayList = new ArrayList<Attack>(){{
        add(new Attack("Freeze Assets", 1, 1));
        add(new Attack("Pound Key", 2, 5 ));
        add(new Attack("Double Talk", 2, 8));
        add(new Attack("Hot Air", 3, 10));
    }};

    public ColdCaller(){
        super("Cold Caller", startingBattlePhrasesArrayList, 1, 5, attackArrayList);
    }

}
