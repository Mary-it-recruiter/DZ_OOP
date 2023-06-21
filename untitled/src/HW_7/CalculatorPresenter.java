package HW_7;

import java.util.ArrayList;
import java.util.List;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;
    private List<String> history;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        history = new ArrayList<>();
    }

    public void run() {
        while (true) {
            ComplexNumber a = view.getComplexNumber();
            char operator = view.getOperator();
            ComplexNumber b = null;

            if (operator == '^' || operator == 's') {
                b = view.getComplexNumber();
            }
            ComplexNumber result = null;
            String operation = "";
            switch (operator) {
                case '+':
                    result = model.add(a, b);
                    operation = String.format("%s + %s = %s", a, b, result);
                    break;
                case '-':
                    result = model.subtract(a, b);
                    operation = String.format("%s - %s = %s", a, b, result);
                    break;
                case '*':
                    result = model.multiply(a, b);
                    operation = String.format("%s * %s = %s", a, b, result);
                    break;
                case '/':
                    result = model.divide(a, b);
                    operation = String.format("%s / %s = %s", a, b, result);
                    break;
                case '^':
                    result = model.power(a, b);
                    operation = String.format("%s ^ %s = %s", a, b, result);
                    break;
                case 's':
                    result = model.squareRoot(a);
                    operation = String.format("sqrt(%s) = %s", a, result);
                    break;
                case 'h':
                    view.displayHistory(history);
                    continue;
                case 'q':
                    return;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }
            history.add(operation);
            System.out.println(result);
        }
    }
}