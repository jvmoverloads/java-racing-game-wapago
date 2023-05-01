package racing.model;

import racing.util.GetRandomNumber;
import racing.view.GameView;

import java.util.*;

public class Decider {
    GetRandomNumber getRandomNumber = new GetRandomNumber();
    GameView gameView = new GameView();

    public void decideMove(Car car) {

        String currentMoveMarker = car.getMoveMarker();
        int currentPosition = car.getPosition();

        boolean canMove = getRandomNumber.getRandomNumber();

        if(canMove) {
            car.setMoveMarker(currentMoveMarker + "-");
            car.setPosition(currentPosition + 1);
        }

        gameView.showResult(car.getCarName() + " : " + car.getMoveMarker());
    }

    public List<String> decideWinner(List<Car> carList) {
        Map<String, Integer> positionMap = new HashMap<>();
        List<Integer> positionList = new ArrayList<>();
        List<String> winners = new ArrayList<>();

        for(int i=0; i<carList.size(); i++) {
            positionMap.put(carList.get(i).getCarName(), carList.get(i).getPosition());
            positionList.add(carList.get(i).getPosition());
        }

        Integer max = Collections.max(positionList);

        for(Map.Entry<String, Integer> entry : positionMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value == max) {
                winners.add(key);
            }
        }

        return winners;
    }

}
