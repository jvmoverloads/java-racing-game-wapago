package racing.view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public void viewInputCarName() {
        System.out.println("```");
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        System.out.println("```");
    }

    public String[] inputCarName() {
        String inputCarName = scanner.next();
        String[] carNameArray = inputCarName.split(",");

        return carNameArray;
    }

    public void viewInputTimes() {
        System.out.println("```");
        System.out.println("시도할 회수는 몇회인가요?");
        System.out.println("```");
    }

    public String inputTimes() {
        String inputTimes = scanner.next();

        return inputTimes;
    }



}
