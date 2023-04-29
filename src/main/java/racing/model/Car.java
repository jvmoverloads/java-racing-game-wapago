package racing.model;

import racing.util.GetRandomNumber;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveOrNot(String times) {
        int intTimes = Integer.parseInt(times);

        for(int i=0; i<intTimes; i++) {
            boolean isMove = GetRandomNumber.getMoveCount(intTimes);
        }

    }

}
