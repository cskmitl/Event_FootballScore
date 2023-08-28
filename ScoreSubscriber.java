// Subscriber class
package FootballScore;

class ScoreSubscriber implements ScoreListener {
    @Override
    public void scoreChange(ScoreEvent scoreEvent) {
        System.out.println("live result: " + scoreEvent.getScore());
    }
}