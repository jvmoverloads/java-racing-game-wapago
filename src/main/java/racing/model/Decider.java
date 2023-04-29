package racing.model;

import racing.util.GetRandomNumber;

import java.util.List;

public class Decider {
    GetRandomNumber getRandomNumber = new GetRandomNumber();
    public void decideMove(Car car) {

        String currentMoveMarker = car.getMoveMarker();
        int currentPosition = car.getPosition();

        boolean canMove = getRandomNumber.getRandomNumber();

        if(canMove) {
            car.setMoveMarker(currentMoveMarker + "-");
        }

        car.setPosition(currentPosition + 1);

        System.out.println("이름: " + car.getCarName());
        System.out.println("현재까지 진행횟수: " + car.getPosition());
        System.out.println("마커: " + car.getMoveMarker());
        System.out.println("==============================");
    }

    public void decideWinner(List<Car> carList) {

    }
}
