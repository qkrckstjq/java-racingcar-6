package racingcar.Model.Domain.Cars;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Model.ConditionValues;
import racingcar.View.DefaultMessage;

public class CarObject implements Car{
    private String name;
    private String progress = "";
    public boolean isForward () {
        return Randoms.pickNumberInRange(0, 9) >= ConditionValues.MIN_FORWARD_VALUE.getNumber();
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setProgress () {
        this.progress+=DefaultMessage.PROGRESS_MESSAGE.getMessage();
    }

    public String getName () {
        return this.name;
    }
    public String getProgress () {
        return this.progress;
    }
}
