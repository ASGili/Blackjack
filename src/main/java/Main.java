import GamePackage.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();

        int playerValue = game.getPlayer().getHandValue();
        int dealerValue = game.getDealer().getHandValue();

        if (playerValue > dealerValue) {
            System.out.println("Player wins.");
        } else {
            System.out.println("Dealer wins.");
        }
    }
}