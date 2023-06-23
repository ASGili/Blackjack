package GamePackage;

import PlayerPackage.Dealer;
import PlayerPackage.Player;

public class Game {

    public static void main(String[] args) {
    }

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
        player.requestCard();
        player.requestCard();
    }
}