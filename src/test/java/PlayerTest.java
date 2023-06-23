import CardPackage.Card;
import PlayerPackage.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player;
    private Card card;

    @Before
    public void setUp(){
        player = new Player();
        card = new Card();
    }

    @Test
    public void canGetHandValue_0(){
        assertEquals(0,player.getHandValue());
    }
    @Test
    public void canGetHandValue_1(){
        player.addCard(card);
        assertEquals(card.getCardValue(),player.getHandValue());
    }


}
