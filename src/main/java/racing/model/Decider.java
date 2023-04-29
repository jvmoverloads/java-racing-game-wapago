package racing.model;

public class Decider {

    Result result = new Result();

    public void decideMove(Car car) {
        double num = Math.random();
        int randomNumber = (int) (num * 10);

        System.out.println("랜덤숫자: " + randomNumber);

        if(randomNumber >= 4) {
            int currentPosition = car.getPosition();
            car.setPosition(currentPosition);

            String currentMoveMarker = car.getMoveMarker();
            car.setMoveMarker(currentMoveMarker + "-");
        }
    }

    public void decideWinner() {

    }
}
