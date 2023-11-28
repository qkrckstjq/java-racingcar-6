package racingcar.Controller;

import racingcar.Model.Cars.CarObject;
import racingcar.Model.Utils;
import racingcar.Model.Validation;
import racingcar.View.DefaultMessage;
import racingcar.View.InputView;
import racingcar.View.OutputView;

import java.util.Arrays;

public class GameController {
    private CarObject[] carList;
    private int progressNumber;
    public void run () {
        translateNames(InputView.printInputCars());
        translateNumber(InputView.printInputNumber());
        printSteps();
        printWinner();
    }

    private void translateNames (String names) {
        String[] nameList = names.split(",");
        validateInputName(nameList);
        initCarsName(nameList);
    }

    private void validateInputName (String[] nameList) {
        for (String s : nameList) {
            Validation.validateNameLength(s);
        }
    }

    private void initCarsName (String[] nameList) {
        carList = new CarObject[nameList.length];
        for(int i = 0; i < nameList.length; i++) {
            carList[i] = new CarObject();
            carList[i].setName(nameList[i]);
        }
    }

    private void translateNumber (String inputNumber) {
        this.progressNumber = Validation.validateInteger(inputNumber);
    }

    private void printSteps () {
        OutputView.printResultMessage();
        for(int i = 0; i < progressNumber; i++) {
            printStepResult();
        }
    }

    private void printStepResult () {
        for (CarObject carObject : carList) {
            if (carObject.isForward()) {
                carObject.setProgress();
            }
            OutputView.printResult(carObject.getName(), carObject.getProgress());
        }
        System.out.println();
    }

    private void printWinner () {
        OutputView.printResult(DefaultMessage.WINNER_MESSAGE.getMessage(), Utils.getWinners(carList));
    }




}
