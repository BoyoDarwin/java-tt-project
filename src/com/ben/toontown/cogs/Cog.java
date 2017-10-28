package com.ben.toontown.cogs;

import com.ben.toontown.Util;
import com.ben.toontown.toons.Toon;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ben on 3/26/17.
 */
public abstract class Cog {
    private String name;
    public String getName() { return this.name; }
    public void setName(String name) {this.name = name;}

    private int minLevel;
    public int getMinLevel(){return this.minLevel;}
    public void setMinLevel(int minLevel) {this.minLevel = minLevel;}

    private int maxLevel;
    public int getMaxLevel() {return this.maxLevel;}
    public void setMaxLevel(int maxLevel) {this.maxLevel = maxLevel;}

    private ArrayList<String> startingBattlePhrases;
    public ArrayList<String> getStartingBattlePhrases() {return this.startingBattlePhrases;}
    public void setStartingBattlePhrases(ArrayList<String> startingBattlePhrases){this.startingBattlePhrases = startingBattlePhrases;}

    private CogType cogType;
    public CogType getCogType() {return this.cogType;}
    public void setCogType(CogType cogType){this.cogType = cogType;}

    private ArrayList<Attack> attackArrayList;
    public ArrayList<Attack> getAttackArrayList() { return this.attackArrayList; }
    public void setAttackArrayList(ArrayList<Attack> attackArrayList){this.attackArrayList = attackArrayList;}

    /**
     * Initializes a new instance of the Cog class.
     * @param name Cog name.
     * @param cogType Cog type.
     * @param startingBattlePhrases Cog starting battle phrases.
     * @param minLevel Cog minimum level.
     * @param maxLevel Cog maximum level.
     * @param attackArrayList Cog attacks.
     */
    public Cog(String name, CogType cogType, ArrayList<String> startingBattlePhrases, int minLevel, int maxLevel, ArrayList<Attack> attackArrayList){
        setName(name);
        setCogType(cogType);
        setStartingBattlePhrases(startingBattlePhrases);
        setMinLevel(minLevel);
        setMaxLevel(maxLevel);
        setAttackArrayList(attackArrayList);
    }
    public void attack(Toon toon){
        Attack t = getRandomAttack();
        int dmg = new Random().nextInt(t.getMaxDamage()) + 1;
        Util.printAnimatedText(getName() + " attacked " + toon.getName() + " for " + dmg + " damage.");
        toon.damage(dmg);
    }

    private Attack getRandomAttack(){
        return getAttackArrayList().get(new Random().nextInt(getAttackArrayList().size()));
    }
}
