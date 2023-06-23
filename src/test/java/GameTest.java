import GamePackage.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void hasDealerWithEmptyHand(){
        assertEquals(0 ,game.getDealer().getHandSize());
    }
    @Test
    public void hasPlayerWithEmptyHand(){
        assertEquals(0 ,game.getPlayer().getHandSize());
    }

    @Test
    public void canDealStartingPosition(){
        game.startGame();
        assertEquals(2, game.getPlayer().getHandSize());
        assertEquals(1, game.getDealer().getHandSize());
    }
}
