package com.ben.toontown.playgrounds.ToontownCentral;

import com.ben.toontown.playgrounds.Street;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class LoopyLane extends Street {
    public LoopyLane(){ super("Loopy Lane");
    }
    public void explore(){
        System.out.printf("[1] Search for Buildings x%n");
        System.out.printf("[2] Search for Cogs%n");
        System.out.printf("[3] Go Fishing");
        System.out.printf("[4] Search for Cog Buildings");
        System.out.printf("[5] Go to the end of street");
        System.out.printf("[6] Go back to Playground");
        throw new NotImplementedException();
    }
    public void printCogs(){

    }

}
