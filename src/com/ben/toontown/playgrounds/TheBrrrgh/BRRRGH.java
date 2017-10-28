package com.ben.toontown.playgrounds.TheBrrrgh;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class BRRRGH extends Playground {
    public BRRRGH(){
        super("The Brrrgh", "BRRRGH");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Sleet Street.%n");
        System.out.printf("[5] Go to Walrus Way.%n");
        System.out.printf("[6] Go to Polar Place.%n");
        throw new NotImplementedException();
    }
}
