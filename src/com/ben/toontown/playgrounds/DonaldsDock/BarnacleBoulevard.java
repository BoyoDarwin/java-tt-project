package com.ben.toontown.playgrounds.DonaldsDock;

import com.ben.toontown.playgrounds.Street;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class BarnacleBoulevard extends Street {
    public BarnacleBoulevard(){
        super("Barnacle Boulevard");
    }
    public void explore(){
        System.out.printf("[1] Explore Building x%n");
        throw new NotImplementedException();
    }
    public void printCogs(){

    }

}
