package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private List<Frame> frames;
    private Frame currentFrame;

    public BowlingGame() {
        this.frames = new ArrayList<>();
        this.currentFrame = new Frame();
        frames.add(currentFrame);
    }

    public void roll(int hits) {
        currentFrame.roll(hits);
        if (currentFrame.isEnd() && frames.size() < 10) {
            currentFrame = new Frame();
            frames.add(currentFrame);
        }
    }

    public int getScore() {
        int scores = 0;
        for (int i = 0; i < frames.size(); i++) {
            scores += frames.get(i).getScore();
            if ((frames.get(i).getScore() == 10)
                    && (!frames.get(i + 1).getRolls().isEmpty())) {
                scores += frames.get(i + 1).getRolls().get(0);
            }
        }
        return scores;
    }

    public boolean isEnd() {
        if (frames.size() == 10 && currentFrame.isEnd()) {
            return true;
        } else {
            return false;
        }
    }

    public String showFramesScore() {
        return null;
    }
}