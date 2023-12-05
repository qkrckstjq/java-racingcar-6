package racingcar.Model;

import racingcar.Model.Domain.Cars.CarObject;

public class Utils {
    public static String getWinners (CarObject[] list) {
        StringBuilder result = new StringBuilder();
        int max = 0;
        for(int i = 0; i < list.length; i++) {
            int progressNumber = list[i].getProgress().length();
            String name = list[i].getName();
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
