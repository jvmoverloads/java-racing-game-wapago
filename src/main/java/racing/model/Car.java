package racing.model;

import racing.service.Movable;
import racing.view.GameView;

public class Car {

    private final CarName carName;
    private Position position;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.position = new Position();
    }

    public void move(Movable movingStrategy) {
        if (movingStrategy.canMove()) {
            position = this.position.move();
        }
    }

    public void printCurrPosition() {
        GameView.print(this.carName.getName() + " : " + this.position.getCurrentPosition());
    }

    public int getCurrentPosition() {
        return this.position.getCurrentPosition().length();
    }

    public String getNameIfWin(int winnerPosition) {
        if(this.position.getCurrentPosition().length() == winnerPosition) {
            return this.carName.getName() + ", ";
        }
        return "";
    }
}
