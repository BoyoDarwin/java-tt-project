package com.ben.toontown;

import com.ben.toontown.playgrounds.DaisyGardens.DG;
import com.ben.toontown.playgrounds.DonaldsDock.DD;
import com.ben.toontown.playgrounds.DonaldsDreamland.DDL;
import com.ben.toontown.playgrounds.MinniesMelodyLand.MML;
import com.ben.toontown.playgrounds.Playground;
import com.ben.toontown.playgrounds.TheBrrrgh.BRRRGH;
import com.ben.toontown.playgrounds.ToontownCentral.TTC;

/**
 * Created by ben on 3/26/17.
 */
public class PlaygroundHelper {
    public static Playground toontownCentral;
    public static Playground donaldsDock;
    public static Playground daisyGardens;
    public static Playground minniesMelodyLand;
    public static Playground theBrrrgh;
    public static Playground donaldsDreamLand;

    public static void createPlaygrounds(){
        toontownCentral = new TTC();
        donaldsDock = new DD();
        daisyGardens = new DG();
        minniesMelodyLand = new MML();
        theBrrrgh = new BRRRGH();
        donaldsDreamLand = new DDL();
    }
}
