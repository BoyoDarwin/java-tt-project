package com.ben.toontown;


import com.ben.toontown.toons.Toon;

import java.util.Scanner;

/**
 * Created by ben on 3/26/17.
 */
public class Util {

    private static final Scanner READER = new Scanner(System.in);

    public static void clearConsole(){
        try {
            Runtime.getRuntime().exec("cls");

        } catch(Exception e){

        }
        try{
            Runtime.getRuntime().exec("clear");
        } catch (Exception e){

        }
    }

    public int Jellybeans = 0;

    public void jellybeans(int Amount){
        Jellybeans = Jellybeans + Amount;
    }

    public int getJellybeans(){
        return Jellybeans;
    }

    public static void printAnimatedText(String text)
    {
        char[] arr = text.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s", arr[i]);
            sleep(60);
        }
        System.out.printf("%n");
    }

    public static void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }

    public static String getOs(){
        return System.getProperty("os");
    }

    public static Boolean playerWantsToontorial(){
        while(true){
            System.out.printf("Would you like to play the tutorial? (y/n) ");
            switch(READER.nextLine().toLowerCase()){
                case "y":{
                    return true;
                }
                case "n":{
                    return false;
                }
                default:{
                    break;
                }
            }
            READER.nextLine();
        }

    }

    public static void printMainOptions(Toon toon){
        while(true){
            System.out.printf("[1] Explore %s.%n", toon.getCurrentPlayground().getPlaygroundName());
            System.out.printf("[2] View toon stats.%n");
            System.out.printf("[3] Open your shticker book.%n");
            System.out.printf("What would you like to do? ");
            if(READER.hasNextInt()){
                switch(READER.nextInt()){
                    case 1:{
                        System.out.printf("%n");
                        toon.getCurrentPlayground().explore();
                        System.out.printf("%n");
                        break;
                    }
                    case 2:{
                        toon.printStats();
                        break;
                    }
                    case 3:{
                        toon.openShtickerBook();
                    }
                }
            }
            READER.nextLine();
        }
    }

    public static void writeChar(Character letter, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(letter);
        }
        System.out.println();
    }
}
