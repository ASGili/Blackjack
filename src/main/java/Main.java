import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import GamePackage.Game;

public class Main {
    
    static Scanner scan = new Scanner(System.in);
    static Game game = new Game();

public static void main(String[] args){
    
    System.out.print("Do you want to play blackjack? (y/n): ");
    char playerInput = scan.next().charAt(0);

    play(playerInput);
}

public static void play(char playerInput){

   if (move(playerInput)){
        game.startGame();

        System.out.println("Would you like another card? (y/n): ");
        char anotherCard = scan.next().charAt(0);

        while(move(anotherCard)){
                game.getPlayer().requestCard();
                
                if(game.getPlayer().getHandValue()<=21){
                    System.out.println("Player's hand is now: " + game.getPlayer().getHandValue());
                      System.out.println("Would you like another card? (y/n): ");
                      anotherCard = scan.next().charAt(0);
                }else{
                    System.out.println("Player bust with " + game.getPlayer().getHandValue());
                    anotherCard = 'n';}
                      

        }

        if(!move(anotherCard)){
            gameEnd();
        }
    }
}
    
    public static void gameEnd(){ 
        game.getDealer().requestCard();
        game.getDealer().requestCard();
        game.getDealer().requestCard();
        game.getDealer().requestCard();

        int playerValue = game.getPlayer().getHandValue();
        int dealerValue = game.getDealer().getHandValue();
        if (playerValue > 21) {
            System.out.println("Dealer wins.");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer draws to " + game.getDealer().getHandValue() );
            System.out.println("Dealer wins.");
        }else {
            System.out.println("Dealer draws to " + game.getDealer().getHandValue() );
            System.out.println("Player wins.");}
    }
    public static boolean move(char x) {
          if (x == 'y')
               return true;
          else
               return false;
     }

}
