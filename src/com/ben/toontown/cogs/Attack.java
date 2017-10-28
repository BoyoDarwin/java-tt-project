package com.ben.toontown.cogs;

/**
 * Created by darwin on 3/26/17.
 */
public class Attack {

    private String attackName;
    public String getAttackName() { return this.attackName; }
    public void setAttackName(String name) { this.attackName = attackName;}

    private int minDamage;
    public int getMinDamage() { return minDamage; }
    public void setMinDamage(int minDamage) { this.minDamage = minDamage; }

    private int maxDamage;
    public int getMaxDamage() { return maxDamage; }
    public void setMaxDamage(int maxDamage) { this.maxDamage = maxDamage; }

    public Attack(String attackName, int minDamage, int maxDamage){
        this.attackName = attackName;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

}
