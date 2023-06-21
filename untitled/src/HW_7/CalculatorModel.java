package HW_7;

import java.util.List;
import java.util.ArrayList;

public class CalculatorModel {
    private List<String> history;

    public CalculatorModel() {
        history = new ArrayList<>();
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        history.add(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.subtract(b);
        history.add(String.format("%s - %s = %s", a, b, result));
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        history.add(String.format("%s * %s = %s", a, b, result));
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        history.add(String.format("%s / %s = %s", a, b, result));
        return result;
    }

    public ComplexNumber power(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.power((int) b.getReal());
        history.add(String.format("%s ^ %s = %s", a, b, result));
        return result;
    }

    public ComplexNumber squareRoot(ComplexNumber a) {
        ComplexNumber result = a.squareRoot();
        history.add(String.format("sqrt(%s) = %s", a, result));
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}
