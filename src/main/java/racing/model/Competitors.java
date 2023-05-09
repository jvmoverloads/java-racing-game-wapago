package racing.model;

import racing.service.Movable;
import racing.view.GameView;

public class Competitors {

    private final Cars cars;

    public Competitors(String carNames) {
        this.cars = new Cars(carNames);
    }

    public void move(Movable movingStrategy) {
        cars.play(movingStrategy);
    }

    public void printMoveResult() {
        cars.printCurrPositions();
    }

    public void printSummary() {
        int winnerPosition = cars.getWinnerPosition();
        StringBuilder result = new StringBuilder();
        result.append(cars.getWinnerNames(winnerPosition));
        GameView.print(removeLastComma(result) + "가 최종 우승했습니다.");
    }

    private String removeLastComma(StringBuilder result) {
        return result.substring(0, result.length() - 2);
    }
}