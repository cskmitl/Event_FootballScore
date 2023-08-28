package FootballScore;

import java.util.ArrayList;
import java.util.List;

// Source class
class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void registerListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void unregisterListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String score) {
        ScoreEvent scoreEvent = new ScoreEvent(score);
        for (ScoreListener listener : listeners) {
            listener.scoreChange(scoreEvent);
        }
    }
}
