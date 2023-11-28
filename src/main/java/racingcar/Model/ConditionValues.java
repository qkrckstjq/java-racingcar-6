package racingcar.Model;

public enum ConditionValues {
    MIN_NAME_LENGTH(5),
    MIN_FORWARD_VALUE(4);

    private int number;

    ConditionValues (int number) {
        this.number = number;
    }

    public int getNumber () {
        return this.number;
    }
}
