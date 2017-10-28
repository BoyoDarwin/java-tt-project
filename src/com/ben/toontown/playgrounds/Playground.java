package com.ben.toontown.playgrounds;

/**
 * Created by ben on 3/26/17.
 */
public abstract class Playground {

    private String playgroundName;
    public String getPlaygroundName() { return playgroundName; }
    public void setPlaygroundName(String playgroundName) { this.playgroundName = playgroundName; }

    private String abbreviation;
    public String getAbbreviation() { return abbreviation; }
    public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation; }

    public Playground(String playgroundName, String abbreviation){
        setPlaygroundName(playgroundName);
        setAbbreviation(abbreviation);
    }

    public void enter(){
        System.out.printf("%n\tYou enter %s.%n%n", getPlaygroundName());
    }

    public void explore(){

    }


}
