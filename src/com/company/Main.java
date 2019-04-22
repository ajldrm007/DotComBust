package com.company;

import javax.print.DocFlavor;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }





        public void checkUserGuess(String userGuess){
            numOfGuesses++;
            String result = "miss";

            for(DotCom dotComToTest : dotComsList){
                result = dotComToTest.checkYourself(userGuess);
                if(result.equals("hit")){
                    break;
                }
                if(result.equals("kill")){
                    dotComsList.remove(dotComToTest);
                    break;
                }
            }
            System.out.println(result);

        }

        public void finishGame(){
            System.out.println("All Dot Coms are dead! Your stock is now worthless.");
            if(numOfGuesses <=18){
                System.out.println("It only took you " + numOfGuesses + " guesses.");
                System.out.println(" YOU got out before your options sank.");

            }else{
                System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
                System.out.println("Fish are dancing with your options.");
            }
        }

    }
}
