package com.ben.toontown.toons;

import com.ben.toontown.PlaygroundHelper;
import com.ben.toontown.Util;
import com.ben.toontown.playgrounds.Playground;
import com.ben.toontown.playgrounds.ToontownCentral.TTC;
import com.ben.toontown.shtickerbook.ShtickerBook;
import com.ben.toontown.toontasks.ToonTask;

/**
 * Created by ben on 3/25/17.
 */
public class Toon {

    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int laff;
    public int getLaff() {
        return this.laff;
    }
    public void setLaff(int laff) {
        this.laff = laff;
    }

    private Species species;
    public Species getSpecies() {
        return this.species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }

    private Playground currentPlayground;
    public Playground getCurrentPlayground() { return currentPlayground; }
    public void setCurrentPlayground(Playground currentPlayground) { this.currentPlayground = currentPlayground; }

    private ToonTask currentToonTask;
    public ToonTask getCurrentToonTask() {return this.currentToonTask;}
    public void setCurrentToonTask(ToonTask currentToonTask) {this.currentToonTask = currentToonTask;}

    private Boolean isSad;
    public Boolean getIsSad() {return this.isSad;}
    public void setIsSad(Boolean isSad) {this.isSad = true;}

    public Toon(String name, Species species) {
        setName(name);
        setLaff(15);
        setSpecies(species);
        setCurrentPlayground(PlaygroundHelper.toontownCentral);
    }

    public void printStats() {
        int len = "Name: ".length() + getName().length()
                + "Laff: ".length() + String.valueOf(getLaff()).length()
                + "Species: ".length() + getSpecies().name().length() + 12; // 4 spaces per tab, 1 tab per item

        Util.writeChar('=', len);
        System.out.printf("Name: %s    Laff: %d    Species: %s%n", getName(), getLaff(), getSpecies().name());
        Util.writeChar('=', len);
    }

    public void damage(int amount){
        int current = getLaff();
        if(current - amount >= 1){
            setLaff(current - amount);
        } else {
            setLaff(-1);
            isSad = true;
        }
    }


    public void openShtickerBook() {
        Util.printAnimatedText("\n\tYou open your shticker book.\n");
        ShtickerBook.printShtickerBook(this);
    }
}
