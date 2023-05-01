package racing.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {
    private final static String NUMERIC = "^[1-9]+$";
    private final static String REG = "^[`~!@#$%^&*()-_=+]";

// 자동차 이름은 5자를 초과할 수 없다.
// 자동차 이름은 쉼표(,)를 기준으로 구분한다.
    public String[] validateInputCarNames(String inputCarNames) {
        String carNames = StringUtils.deleteWhitespace(inputCarNames);

        String[] carNamesArray = makeCarNamesArray(carNames);

//        isContainSpecialChar(carNamesArray);
        isCarAtLeatTwo(carNamesArray);
        isDuplicateCarNames(carNamesArray);

        return carNamesArray;
    }

    public void validateInputPlayTimes(String inputPlayTime) {
        if(!inputPlayTime.matches(NUMERIC)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }
    }

    public String[] makeCarNamesArray(String carNames) {
        String[] carNamesArray = carNames.split(",");

        return carNamesArray;
    }

//    public void isContainSpecialChar(String[] carNamesArray) {
//        for(String carName : carNamesArray) {
//            if(!carName.matches(REG)) {
//                throw new IllegalArgumentException("특수문자는 입력할 수 없습니다.");
//            }
//        }
//    }

    public void isCarAtLeatTwo(String[] carNamesArray) {
        if(!(carNamesArray.length >= 2)) {
            throw new IllegalArgumentException("최소 2대의 자동차이름을 입력해야 합니다.");
        }
    }

    private void isDuplicateCarNames(String[] carNamesArray) {
        List<String> carList = Arrays.asList(carNamesArray);
        Set<String> carSet = new HashSet<>(carList);

        if(carList.size() != carSet.size()) {
            throw new IllegalArgumentException("자동차이름은 중복될 수 없습니다.");
        }
    }
}
