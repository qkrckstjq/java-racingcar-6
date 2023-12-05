package racingcar.Controller;

import racingcar.Model.Domain.Cars.Car;
import racingcar.Model.Domain.Cars.CarObject;
import racingcar.Model.Service.RaceService;
import racingcar.Model.Utils;
import racingcar.Model.Validation;
import racingcar.View.DefaultMessage;
import racingcar.View.InputView;
import racingcar.View.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public void run () {
        List<Car> carList = translateNames(InputView.printInputCars());
        int progressNumber = translateNumber(InputView.printInputNumber());
        printSteps(progressNumber, carList);
        printWinner(carList);
    }

    private List<Car> translateNames (String names) {
        String[] nameList = names.split(",");
        validateInputName(nameList);
        return initCarsName(nameList);
    }

    private void validateInputName (String[] nameList) {
        for (String s : nameList) {
            Validation.validateNameLength(s);
        }
    }

    private List<Car> initCarsName (String[] nameList) {
        List<Car> carList = new ArrayList<>(nameList.length);
        for(int i = 0; i < nameList.length; i++) {
            CarObject temp = new CarObject();
            temp.setName(nameList[i]);
            carList.add(i,temp);
        }
        return carList;
    }

    private int translateNumber (String inputNumber) {
        return Validation.validateInteger(inputNumber);
    }

    private void printSteps (int progressNumber, List<Car> carList) {
        OutputView.printResultMessage();
        RaceService raceService = new RaceService();
        for(int i = 0; i < progressNumber; i++) {
            raceService.race(carList);
            printStepResult(carList);
        }
    }
    private void printStepResult (List<Car> carList) {
        for (Car carObject : carList) {
            OutputView.printResult(carObject.getName(), carObject.getProgress());
        }
        System.out.println();
    }

    private void printWinner (List<Car> carList) {
        OutputView.printResult(DefaultMessage.WINNER_MESSAGE.getMessage(), Utils.getWinners(carList));
    }


}
