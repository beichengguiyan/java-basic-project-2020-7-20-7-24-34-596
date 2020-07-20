package bowling;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    private List<Integer> rolls = new ArrayList<Integer>();

    public void roll(int hits) {
        rolls.add(hits);
    }

    public int getScore() {
        int scores = 0;
        for (int roll : rolls) {
            scores += roll;
        }
        return scores;
    }

    public boolean isEnd() {
        if (rolls.size() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> getRolls() {
        return rolls;
    }

    public void setRolls(List<Integer> rolls) {
        this.rolls = rolls;
    }
}
