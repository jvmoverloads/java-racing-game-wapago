package racing.controller;

import racing.model.Car;
import racing.view.InputView;

public class RacingController {

    InputView inputView = new InputView();
//    CarServiceImpl carService = new CarServiceImpl();

    public void start() {
        set();
    }

    public void set() {
        Car[] cars = setInformation();
        String times = setTimes();

        play(cars, times);
    }

    public Car[] setInformation() {
        inputView.viewInputCarName();
        String[] carNames = inputView.inputCarName();

        Car[] cars = setCars(carNames);

        return cars;
    }

    public Car[] setCars(String[] carNames) {
        int carNameCount = carNames.length;
        Car[] carObjectArray = new Car[carNameCount];

        for(int i=0; i<carNameCount; i++) {
            carObjectArray[i] = new Car(carNames[i]);
        }

        return carObjectArray;
    }

    public String setTimes() {
        inputView.viewInputTimes();
        String times = inputView.inputTimes();

        return times;
    }

    public void play(Car[] cars, String times) {
        int carNameCount = cars.length;
        boolean isMove;

//        moveOrNot();
    }
}
