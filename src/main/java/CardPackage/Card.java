package CardPackage;
import java.util.Random;

public class Card {

    private final String name;
    private final CardValue cardValue;
    Random random = new Random();
    int randomNumber = random.nextInt(12);

    public Card(){
        this.cardValue = CardValue.values()[randomNumber];
        this.name = cardValue.getName();
    }

    public int getCardValue(){
        return cardValue.getValue();
    }

    public String getName(){
        return name;
    }
}
