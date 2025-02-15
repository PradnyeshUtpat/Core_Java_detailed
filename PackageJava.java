import CalculatorPackage.AdvancedCalculator;
import CalculatorPackage.BasicCalculator;
public class PackageJava {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        BasicCalculator basicCalculator = new BasicCalculator();

        int res1 = advancedCalculator.add(1,2);
        int res2 = advancedCalculator.multiply(3,4);
        System.out.println(res1);
        System.out.println(res2);

    }
}
