import java.io.IOException;

public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquation calc = new CalculateTheEquation();
    //    calc.setVariable(1);
        try {
            calc.writeResultToBin("src/bin.bin");
            calc.readResultFromBin("src/bin.bin");
            System.out.println("Result of calculation: " + calc.doCalculation());
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            calc.writeResultToTxt("src/txt.txt");
            calc.readResultFromTxt("src/txt.txt");
            System.out.println("Result of calculation: " + calc.doCalculation());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
