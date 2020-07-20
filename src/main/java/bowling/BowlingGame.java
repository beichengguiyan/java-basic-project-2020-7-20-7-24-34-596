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
        if (currentFrame.isEnd()) {
            frames.add(new Frame());
        }
    }

    public int getScore() {
        int scores = 0;
        for (Frame frame : frames) {
            scores += frame.getScore();
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