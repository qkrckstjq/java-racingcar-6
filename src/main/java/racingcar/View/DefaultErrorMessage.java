package racingcar.View;

public enum DefaultErrorMessage {
    VALIDATE_INTEGER("시도 회수는 숫자만 입력 가능합니다."),
    VALIDATE_FORMAT("올바르지 않은 입력 형식 입니다."),
    VALIDATE_NAME("이름은 5자 이하만 입력 가능합니다.");

    private String message;

    DefaultErrorMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }
}
