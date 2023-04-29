package racing.service;

import racing.model.Result;

public class DecideServiceImpl implements DecideService {

    @Override
    public void pickCar(String[] carNames) {
        int carQuantity = carNames.length;

//        for(int i=0; i<carQuantity; i++) {
//            carNames[i]
//        }
    }

    @Override
    public boolean decideMove(String[] carNames, int playTime) {
        return false;
    }
}
