package racing.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars = new ArrayList<>();

    int carQuantity;
    int playTime;

    Decider decider = new Decider();

    public void setCars(String[] carNames, int playTime) {
        carQuantity = carNames.length;
        this.playTime = playTime;

        setCar(carNames);
    }

    public void setCar(String[] carNames) {
        for(String car : carNames) {
            cars.add(new Car(car));
        }
    }

    public void move() {
        for(Car car : cars) {
            decider.decideMove(car);

//            System.out.println("이름: " + car.getCarName());
//            System.out.println("위치: " + car.getMoveMarker());
//            System.out.println("==============================");
        }
    }

}
