package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
public class InputView {
    public static String printInputCars () {
        System.out.println(DefaultMessage.START_MESSAGE.getMessage());
        return Console.readLine();
    }
    public static String printInputNumber () {
        System.out.println(DefaultMessage.ASK_NUMBER_MESSAGE.getMessage());
        return Console.readLine();
    }
}
