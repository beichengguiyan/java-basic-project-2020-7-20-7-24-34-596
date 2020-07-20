package bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void should_return_0_when_given_1() {
        //given
        int hits = 1;
        int expected = 1;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        bowlingGame.roll(hits);
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected,actual);

    }

}