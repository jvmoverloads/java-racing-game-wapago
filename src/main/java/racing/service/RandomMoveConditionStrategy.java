package racing.service;

public class RandomMoveConditionStrategy implements Movable{

    private static final int CONDITION = 4;

    @Override
    public boolean canMove() {
        return (int) (Math.random() * 10) >= CONDITION;
    }
}
