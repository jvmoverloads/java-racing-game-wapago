package racing.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public List<Car> carList = new ArrayList<>();
    int playTime;

    Decider decider = new Decider();

    public void setCar(String[] carNames, int playTime) {
        this.playTime = playTime;

        for(String car : carNames) {
            carList.add(new Car(car, playTime));
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public void move() {
        for(Car car : carList) {
            decider.decideMove(car);
        }
    }
}
