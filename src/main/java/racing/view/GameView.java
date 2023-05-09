package racing.view;

import java.util.Scanner;

public class GameView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void askCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void askPlayCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static String getConsoleInput() {
        return scanner.nextLine();
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printLine() {
        System.out.println();
    }

}
