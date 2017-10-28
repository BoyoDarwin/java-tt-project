package com.ben.toontown.playgrounds.ToontownCentral;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by ben on 3/26/17.
 */
public class TTC extends Playground {
    public TTC(){
        super("Toontown Central", "TTC");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Loopy Lane.%n");
        System.out.printf("[5] Go to Silly Street.%n");
        System.out.printf("[6] Go to Punchline Place.%n");
        throw new NotImplementedException();
    }
}
