package racing.model;

import racing.exception.InvalidCarNameException;
import racing.properties.InvalidCarExceptionMessages;

public class CarName {
    private final String name;

    private static final int CAR_NAME_MAX_LENGTH = 5;

    public CarName(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new InvalidCarNameException(InvalidCarExceptionMessages.INPUT_LESS_THAN_FIVE);
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
