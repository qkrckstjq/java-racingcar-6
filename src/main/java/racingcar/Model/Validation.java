package racingcar.Model;

import racingcar.View.DefaultErrorMessage;

public class Validation {
    public static int validateInteger (String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_INTEGER.getMessage());
        }
    }

    public static void validateNameLength (String name) {
        if(name.length() > ConditionValues.MIN_NAME_LENGTH.getNumber() || name.isEmpty()) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_NAME.getMessage());
        }
    }
}
