package PlayerPackage;
import CardPackage.Card;
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public int getHandValue() {
        int counter = 0;
        if (hand.size() > 0) {
            for (Card card : hand) {
                counter += card.getCardValue();
            }
        }
        return counter;
    }

    public int getHandSize(){
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public String requestCard() {
        String messageNotBust = "Would you like another card? Your total is: ";
        String messageBust = "You have gone bust: ";
        Card newCard = new Card();
        if (getHandValue() <= 21) {
            addCard(newCard);
            if (getHandValue() > 21) {
                return (messageBust + getHandValue());}
            else {
                return (messageNotBust + getHandValue());}
        } else {
            return messageBust;}
    }
}
