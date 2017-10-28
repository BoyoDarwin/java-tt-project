package com.ben.toontown.playgrounds.DonaldsDock;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class DD extends Playground{
    public DD(){
        super("Donald's Dock", "DD");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Seaweed Street%n");
        System.out.printf("[5] Go to Barnacle Boulevard.%n");
        System.out.printf("[6] Go to Lighthouse Lane.%n");
        throw new NotImplementedException();
    }
}
