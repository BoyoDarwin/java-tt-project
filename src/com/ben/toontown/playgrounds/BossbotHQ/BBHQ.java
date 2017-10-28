package com.ben.toontown.playgrounds.BossbotHQ;

import com.ben.toontown.playgrounds.Playground;

/**
 * Created by darwin on 3/26/17.
 */
public class BBHQ extends Playground {
    public BBHQ(){super("Bossbot HQ", "BBHQ");}

    @Override
    public void explore() {
        System.out.printf("[1] Go to the Front Three.%n");
        System.out.printf("[2] Go to the Coin Mint.%n");
        System.out.printf("[3] Go to the Middle Six.%n");
        System.out.printf("[4] Go to the Back Nine.%n");
        System.out.printf("[5] Go to the Clubhouse.%n");
        System.out.printf("[6] Go to the CEO.%n");
    }
}
