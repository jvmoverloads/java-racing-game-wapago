package racing.model;

import racing.util.GetRandomNumber;

public class Car {
    private String carName;

    private int position = 0;
    private String moveMarker = "";

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void setMoveMarker(String moveMarker) {
        this.moveMarker = moveMarker;
    }

    public String getMoveMarker() {
        return this.moveMarker;
    }
}
