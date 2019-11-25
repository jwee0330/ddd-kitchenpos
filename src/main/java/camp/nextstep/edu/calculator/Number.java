package camp.nextstep.edu.calculator;

class Number {
    private static final int ZERO = 0;
    private static final String NOT_A_NUMBER_MESSAGE = "숫자를 입력하세요.";
    private Integer number;

    private Number(final String numberString) {
        parseInt(numberString);
        validate(number);
    }

    static Number of(final String text) {
        return new Number(text);
    }

    public Integer getNumber() {
        return number;
    }

    private void validate(final int number) {
        if (number < ZERO) {
            throw new RuntimeException();
        }
    }

    private void parseInt(final String number) {
        try {
            this.number = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_A_NUMBER_MESSAGE);
        }
    }

}
