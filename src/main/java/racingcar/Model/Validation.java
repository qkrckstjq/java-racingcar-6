package racingcar.Model;

public class Validation {
    public static void ValidateInteger (String number) {
        try {

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("");
        }
    }
}
