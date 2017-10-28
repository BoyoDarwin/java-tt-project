package com.ben.toontown.playgrounds.CashbotHQ;

import com.ben.toontown.playgrounds.Playground;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class CBHQ extends Playground {
    public CBHQ(){
        super("Cashbot HQ","CBHQ");
    }

    @Override
    public void explore(){
        System.out.printf("[1] Go to the Train Yard.%n");
        System.out.printf("[2] Go to the Coin Mint.%n");
        System.out.printf("[3] Go to the Dollar Mint%n");
        System.out.printf("[4] Go to the Bullion Mint.%n");
        System.out.printf("[5] Go to the Cashbot Vault.%n");
        System.out.printf("[6] Go to the Chief Financial Officer.%n");
        throw new NotImplementedException();
    }
}
