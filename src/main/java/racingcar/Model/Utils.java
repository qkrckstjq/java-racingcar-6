package racingcar.Model;

import racingcar.Model.Domain.Cars.Car;
import java.util.List;

public class Utils {
    public static String getWinners (List<Car> list) {
        StringBuilder result = new StringBuilder();
        int max = 0;
        for(int i = 0; i < list.size(); i++) {
            int progressNumber = list.get(i).getProgress().length();
            String name = list.get(i).getName();
            if(max < progressNumber) {
                max = progressNumber;
                result = new StringBuilder(name);
            } else if (max == progressNumber) {
                result.append(String.format(", %s", name));
            }
        }
        return result.toString();
    }
}
