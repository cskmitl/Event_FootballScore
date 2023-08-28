package FootballScore;

import java.util.Scanner;

public class FootballScoreApp {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        ScoreSubscriber subscriber1 = new ScoreSubscriber();
        ScoreSubscriber subscriber2 = new ScoreSubscriber();

        scoreSource.registerListener(subscriber1);
        scoreSource.registerListener(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String scoreInput = scanner.nextLine();

            if (scoreInput.isEmpty()) {
                break;
            }

            scoreSource.setScoreLine(scoreInput);
        }

        scanner.close();
    }
}
