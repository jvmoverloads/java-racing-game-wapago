package racing.util;

public class GetRandomNumber {

    public static boolean getMoveCount(int times) {
        double num = Math.random();
        int randomNumber = (int) (num * 10);

        System.out.println("랜덤숫자 ---> " + randomNumber);

        if(randomNumber >= 4) {
            return true;
        }

        return false;
    }
}
