package com.ben.toontown.toontasks;

import java.util.ArrayList;


/**
 * Created by ben on 3/26/17.
 */
public class GlobalToonTasks {
    public static ArrayList<ToonTask> toonTasks = new ArrayList<ToonTask>()
    {

    };

    public static void createGlobalToonTasks(){
        toonTasks.add(0, new ToonTask("Defeat 1 Flunky.", 0));
        toonTasks.add(1, new ToonTask("Ride the Trolley.", 1));
    }
}
