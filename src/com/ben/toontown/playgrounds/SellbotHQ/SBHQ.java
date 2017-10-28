package com.ben.toontown.playgrounds.SellbotHQ;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class SBHQ extends Playground {
    public SBHQ(){super("Sellbot HQ", "SBHQ");}

    @Override
    public void explore(){
        System.out.printf("[1] Go to Sellbot Factory.%n");
        System.out.printf("[2] Go to the CEO.%n");
        throw new NotImplementedException();
    }
}
