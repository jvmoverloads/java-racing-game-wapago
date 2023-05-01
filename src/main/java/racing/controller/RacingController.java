package racing.controller;

import racing.model.*;
import racing.view.GameView;

import java.util.List;

public class RacingController {

    Cars cars = new Cars();
    User user = new User();
    Decider decider = new Decider();
    GameView gameView = new GameView();

    List<String> winners;

    int playTime;

    public void start() {
        set();
        race();
        pick();
        gameView.showWinner(winners);
    }

    public void set() {
        String[] carNames = user.inputCarNames();
        playTime = user.inputPlayTime();

        cars.setCar(carNames, playTime);
    }

    public void race() {
        int playCount = 0;

        while(playCount != playTime) {
            cars.move();
            playCount++;
        }
    }

    public void pick() {
        List<Car> carList = cars.getCarList();

        winners = decider.decideWinner(carList);
    }
}
