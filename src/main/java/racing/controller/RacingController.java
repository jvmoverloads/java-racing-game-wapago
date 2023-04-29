package racing.controller;

import racing.model.*;

import java.util.List;

public class RacingController {

    Cars cars = new Cars();
    User user = new User();
    Decider decider = new Decider();

    int playTime;

    public void start() {
        set();
        race();
        pick();
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

        decider.decideWinner(carList);

//        for(Car car : carList) {
//            System.out.println(car.getCarName() + "의 최종 점수: " + car.getMoveMarker());
//        }
    }
}
