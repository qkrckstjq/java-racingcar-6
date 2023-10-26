package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.DataObj;

public class Logics {
    public static String forwardOrNot () {
        int randomNumbers = Randoms.pickNumberInRange(0, 9);
        return randomNumbers >= 4 ? "-" : "";
    }

    public static String[] splitNames (String names) {
        return names.split(",");
    }

    public static String winners (DataObj[] Datas) {
        int maxNum = 0;
        String result = "";
        for(int i = 0; i < Datas.length; i++) {
            maxNum = Math.max(maxNum, Datas[i].getProgress().length());
        }
        for(int i = 0; i < Datas.length; i++) {
            if(maxNum == Datas[i].getProgress().length()) {
                if(result.length() == 0) {
                    result+=Datas[i].getName();
                } else {
                    result+=", "+Datas[i].getName();
                }
            }
        }

        return result;
    }

}
