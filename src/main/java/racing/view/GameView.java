package racing.view;

import java.util.List;
import java.util.Scanner;

public class GameView {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

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

    public void viewInputPlayTime() {
        System.out.println("```");
        System.out.println("시도할 회수는 몇회인가요?");
        System.out.println("```");
    }

    public int inputPlayTime() {
        int inputPlayTime = scanner.nextInt();

        return inputPlayTime;
    }

    public void showResult(String result) {
        System.out.println(result);
    }

    public void showWinner(List<String> winners) {
        stringBuilder.append("최종 우승자 : ");

        for(int i=0; i<winners.size(); i++) {
            stringBuilder.append(winners.get(i));

            if(winners.size() != 1 && i != winners.size() - 1) {
                stringBuilder.append(", ");
            }
        }

        String resultStr = stringBuilder.toString();

        System.out.println(resultStr);
    }
}
