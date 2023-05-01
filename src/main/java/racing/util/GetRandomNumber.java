package racing.util;

public class GetRandomNumber {

    public boolean getRandomNumber() {
        double num = Math.random();
        int randomNumber = (int) (num * 10);

        if(randomNumber >= 4) {
            return true;
        }

        return false;
    }
}
