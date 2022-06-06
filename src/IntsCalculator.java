public class IntsCalculator implements Ints {

    private Calculator calculator;
    private Calculator.Formula formula;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.SUM);

        return (int) formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.MULT);

        return (int) formula.result();
    }

    @Override
    public int pow(int a, int b) {
        formula = calculator.newFormula();

        formula.addOperand(a);
        formula.addOperand(b);

        formula.calculate(Calculator.Operation.POW);

        return (int) formula.result();
    }
}
