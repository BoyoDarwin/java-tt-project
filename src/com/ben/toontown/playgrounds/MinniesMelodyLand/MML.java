package com.ben.toontown.playgrounds.MinniesMelodyLand;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class MML extends Playground {
    public MML(){
        super("Minnies Melodyland", "MML");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Alto Avenue.%n");
        System.out.printf("[5] Go to Baritone Boulevard.%n");
        System.out.printf("[6] Go to Tenor Terrace.%n");
        throw new NotImplementedException();
    }
}
