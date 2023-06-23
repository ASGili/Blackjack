package GamePackage;

import PlayerPackage.Dealer;
import PlayerPackage.Player;

public class Game {
    private Player dealer;
    private Player player;

    public Game() {
        this.dealer = new Dealer();
        this.player = new Player();
    }

    public Player getDealer(){
        return dealer;
    }
    public Player getPlayer(){
        return player;
    }

    public void startGame(){
        dealer.requestCard();
        dealer.requestCard();
        player.requestCard();
        player.requestCard();
        System.out.println("Dealer's starting hand is " + dealer.getHandValue());
        System.out.println("Player's starting hand is " + player.getHandValue());
    }
}