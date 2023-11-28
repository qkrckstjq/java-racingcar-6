package racingcar.View;

public class OutputView {
    public static void printResultMessage () {
        System.out.println(DefaultMessage.RUN_RESULT_MESSAGE.getMessage());
    }

    public static void printResult (String name, String progress) {
        System.out.printf("%s : %s\n", name, progress);
    }
}
