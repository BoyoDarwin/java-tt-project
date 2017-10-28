package com.ben.toontown.playgrounds.DaisyGardens;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class DG extends Playground {
    public DG(){
        super("Daisy Gardens", "DG");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to Toon HQ.%n");
        System.out.printf("[2] Go to the Gag Shop.%n");
        System.out.printf("[3] Ride the Trolley.%n");
        System.out.printf("[4] Go to Elm Street.%n");
        System.out.printf("[5] Go to Maple Street.%n");
        System.out.printf("[6] Go to Oak Street.%n");
        throw new NotImplementedException();
    }
}
