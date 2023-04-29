package racing.model;

import racing.util.GetRandomNumber;

public class Car {
    private String carName;
    private int playTime;

    private int position = 0;
    private String moveMarker = "";

    public Car(String carName, int playTime) {
        this.carName = carName;
        this.playTime = playTime;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getPlayTime() {
        return this.playTime;
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
