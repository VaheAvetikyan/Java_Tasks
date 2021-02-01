package MathOperations;

public final class Addition implements Operation {
    private final String PLUS = "+";

    protected Addition() {
    }

    @Override
    public String getSign() {
        return PLUS;
    }

    @Override
    public double operation(double member_one, double member_two) {
        return member_one + member_two;
    }
}
