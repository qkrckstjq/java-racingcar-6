package racingcar.Model.Service;

import racingcar.Model.Domain.Cars.Car;
import java.util.List;
public class RaceService {
    public void race(List<Car> carList) {
        raceOneRound(carList);
    }

    private void raceOneRound(List<Car> carList) {
        for (Car car : carList) {
            if (car.isForward()) {
                car.moveForward();
            }
        }
    }
}
