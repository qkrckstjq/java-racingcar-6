package racingcar.View;

public enum DefaultMessage {
    START_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_NUMBER_MESSAGE("시도할 회수는 몇회인가요?"),
    RUN_RESULT_MESSAGE("실행 결과"),
    WINNER_MESSAGE("최종 우승자");

    private String message;

    DefaultMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }
}
