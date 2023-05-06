package racing.model;

import racing.exception.InvalidCarNamesException;
import racing.properties.InvalidCarExceptionMessages;
import racing.service.Movable;
import racing.view.GameView;

import java.util.Arrays;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = carNameValidator(carNames);
    }

    public List<Car> carNameValidator(String carNames) {
        if (!carNames.contains(",")) {
            throw new InvalidCarNamesException(InvalidCarExceptionMessages.COMMA_EXCEPTION_CONTAIN);
        }

        if (carNames.startsWith(",")) {
            throw new InvalidCarNamesException(InvalidCarExceptionMessages.COMMA_EXCEPTION_START);
        }

        if (carNames.endsWith(",")) {
            throw new InvalidCarNamesException(InvalidCarExceptionMessages.COMMA_EXCEPTION_END);
        }

        if (carNames.split(",").length < 2) {
            throw new InvalidCarNamesException(InvalidCarExceptionMessages.INPUT_MIN_TWO_CARS);
        }

        return Arrays.stream(carNames.split(",")).map(Car::new).toList();
    }

    public void play(Movable movingStrategy) {
        cars.forEach(car -> car.move(movingStrategy));
    }

    public void printCurrPositions() {
        GameView.print("실행 결과");
        cars.forEach(Car::printCurrPosition);
        GameView.printLine();
    }

    public int getWinnerPosition() {
        return cars.stream().mapToInt(Car::getCurrentPosition).max().getAsInt();
    }

    public StringBuilder getWinnerNames(int winnerPosition) {
        StringBuilder result = new StringBuilder();
        cars.forEach(
                car -> result.append(car.getNameIfWin(winnerPosition))
        );

        return result;
    }
}
