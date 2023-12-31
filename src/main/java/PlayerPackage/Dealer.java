package PlayerPackage;

import CardPackage.Card;

public class Dealer extends Player {

    @Override
    public String requestCard(){
        String messageNotBust = "Would you like another card? Your total is: ";
        String messageBust = "The dealer draws to: ";
        Card newCard = new Card();
        if (getHandValue() < 16) {
            addCard(newCard);
            System.out.println(messageBust + getHandValue());
            if (getHandValue() > 16) {
                return (messageBust + getHandValue());
            }
            else {
                return (messageNotBust + getHandValue());
            }
        } else {
            return messageBust;
        }
    }
}
