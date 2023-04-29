package racing.service;

public interface DecideService {
    void pickCar(String[] carNames);
    boolean decideMove(String[] carNames, int playTime);
}
