package racing.exception;

public class InvalidPositionException extends RacingGameException{
    public InvalidPositionException() {
        super("Position 값은 음수일 수 없습니다.");
    }
}
