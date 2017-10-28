package com.ben.toontown.playgrounds.LawbotHQ;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class LBHQ extends Playground{
    public LBHQ(){super("Lawbot HQ", "LBHQ");}

    @Override
    public void explore(){
        System.out.printf("[1] Go to the Lawbot Courthouse%n");
        System.out.printf("[2] Go to the Office A.%n");
        System.out.printf("[3] Go to the Office B%n");
        System.out.printf("[4] Go to the Office C%n");
        System.out.printf("[5] Go to the Office D%n");
        throw new NotImplementedException();
    }
}
