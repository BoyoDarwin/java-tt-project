package com.ben.toontown.makeatoon;

import com.ben.toontown.toons.Species;
import com.ben.toontown.toons.Toon;

import java.util.Scanner;

/**
 * Created by ben on 3/25/17.
 */
public class MakeAToon {

    private Toon tempToon;

    private static final Scanner READER = new Scanner(System.in);

    public MakeAToon(){

    }

    public Toon CreateAToon(){
        String n = promptName();
        Species s = promptSpecies();

        return new Toon(n, s);
    }

    private Species promptSpecies(){

        System.out.printf("[1] Bear%n");
        System.out.printf("[2] Cat%n");
        System.out.printf("[3] Dog%n");
        System.out.printf("[4] Duck%n");
        System.out.printf("[5] Deer%n");
        while(true){
            System.out.print("What species would you like your toon to be? ");
            if(READER.hasNextInt()){
                switch(READER.nextInt())
                {
                    case 1:
                        return Species.Bear;
                    case 2:
                        return Species.Cat;
                    case 3:
                        return Species.Dog;
                    case 4:
                        return Species.Duck;
                    case 5:
                        return Species.Deer;                        
                    default:
                        break;
                }
            }
            READER.nextLine();
        }
    }

    private String promptName(){
        System.out.print("What would you like to name your toon? ");
        return READER.nextLine();
    }
}
