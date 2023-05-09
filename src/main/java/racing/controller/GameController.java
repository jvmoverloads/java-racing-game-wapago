package racing.controller;

import racing.model.Competitors;
import racing.service.Movable;
import racing.service.RandomMoveConditionStrategy;
import racing.view.GameView;

public class GameController {

    private Competitors competitors;
    private int playCount;
    private Movable movingStrategy;

    public void start() {
        set();
        play();
        summary();
    }

    private void set() {
        setMovingStrategy();
        GameView.askCarNames();
        setCompetitors(GameView.getConsoleInput());
        GameView.askPlayCount();
        setPlayCount(GameView.getConsoleInput());
    }

    private void setMovingStrategy() {
        this.movingStrategy = new RandomMoveConditionStrategy();
    }

    private void setCompetitors(String carNames) {
        this.competitors = new Competitors(carNames);
    }

    private void setPlayCount(String playCount) {
        this.playCount = Integer.parseInt(playCount);
    }

    private void play() {
        int count = 0;

        while(count < playCount) {
            competitors.move(movingStrategy);
            competitors.printMoveResult();
            count++;
        }
    }

    private void summary() {
        competitors.printSummary();
    }

}
