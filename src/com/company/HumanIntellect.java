package com.company;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Mark on 16.11.2016.
 */
public class HumanIntellect extends Intellect{
    static Scanner in = new Scanner(System.in);
    @Override
    public Command decide(int score) {

        do{
            System.out.println("Hit/Stand: ");
            String s = in.nextLine();
            if("hit".startsWith(s.toLowerCase())){
                return Command.HIT;
            }else if("stand".startsWith(s.toLowerCase())){
                return Command.STAND;
            }else{
                System.out.println("Command not recognized...");
            }
        }while(true);
    }
}
