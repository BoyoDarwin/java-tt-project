package com.ben.toontown.playgrounds.DonaldsDreamland;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class DDL extends Playground {
    public DDL(){
        super("Donald's Dreamland", "DDL");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Lullaby Lane%n");
        System.out.printf("[5] Go to Pajama Place.%n");
        throw new NotImplementedException();
    }
}
