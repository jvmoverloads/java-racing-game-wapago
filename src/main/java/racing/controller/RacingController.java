package racing.controller;

import racing.model.*;
import racing.service.DecideService;
import racing.view.GameView;

public class RacingController {

    Cars cars = new Cars();
    User user = new User();

    public void start() {
        set();
        race();
    }

    public void set() {
        String[] carNames = user.inputCarNames();
        int playTime = user.inputPlayTime();

        cars.setCars(carNames, playTime);
    }

    public void race() {
        cars.move();
    }
}
