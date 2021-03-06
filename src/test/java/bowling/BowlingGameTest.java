package bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void should_return_1_when_given_1() {
        //given
        int hits = 1;
        int expected = 1;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        bowlingGame.roll(hits);
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void should_return_7_when_given_3_4() {
        //given
        int hits01 = 3;
        int hits02 = 4;
        int expected = 7;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        bowlingGame.roll(hits01);
        bowlingGame.roll(hits02);
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_20_when_given_hits_20_times() {
        //given
        int[] hitsArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 20;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        for (int hit : hitsArray) {
            bowlingGame.roll(hit);
        }
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_20_when_given_hits_5_5_5() {
        //given
        int[] hitsArray = {5,5,5};
        int expected = 20;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        for (int hit : hitsArray) {
            bowlingGame.roll(hit);
        }
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_150_when_given_hits_5_21_times() {
        //given
        int[] hitsArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,5};
        int expected = 150;
        BowlingGame bowlingGame = new BowlingGame();
        //when
        for (int hit : hitsArray) {
            bowlingGame.roll(hit);
        }
        int actual = bowlingGame.getScore();
        //then
        Assert.assertEquals(expected, actual);
    }

}