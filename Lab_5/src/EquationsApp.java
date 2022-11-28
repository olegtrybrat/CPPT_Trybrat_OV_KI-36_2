public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=(x-4)/sin(3x-1) = " + calc.doCalculation(300));
        System.out.println("  y=(x-4)/sin(3x-1) = " + calc.doCalculation(70));
        System.out.println("  y=(x-4)/sin(3x-1) = " + calc.doCalculation(-4444));

        System.out.println("  y=(x-4)/sin(3x-1) = " + calc.doCalculationWithInputInside());
    }
}
