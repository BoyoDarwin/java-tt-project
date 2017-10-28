package com.ben.toontown.cogs.Sellbots;

import com.ben.toontown.cogs.Attack;
import com.ben.toontown.cogs.Cog;
import com.ben.toontown.cogs.CogType;

import java.util.ArrayList;

/**
 * Created by ben on 3/26/17.
 */
public class Sellbot extends Cog{
    /**
     * Initializes a new instance of the Sellbot class.
     * @param name
     * @param startingBattlePhrases
     * @param minLevel
     * @param maxLevel
     * @param attackArrayList
     */
    public Sellbot(String name, ArrayList<String> startingBattlePhrases, int minLevel, int maxLevel, ArrayList<Attack> attackArrayList){
        super(name, CogType.Sellbot, startingBattlePhrases, minLevel, maxLevel, attackArrayList);
    }
}
