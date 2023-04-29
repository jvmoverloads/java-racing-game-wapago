package racing.model;

import racing.view.GameView;

public class User {
    GameView gameView = new GameView();

    public String[] inputCarNames() {
        gameView.viewInputCarName();
        String[] carNamesArray = gameView.inputCarName();

        return carNamesArray;
    }

    public int inputPlayTime() {
        gameView.viewInputPlayTime();
        int playTime = gameView.inputPlayTime();

        return playTime;
    }

}
