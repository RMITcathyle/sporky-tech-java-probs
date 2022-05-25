import java.util.Scanner;

public class HermesCaramel {
    public static void main(String[] args) {
        Scanner inputCost = null;
        double[] cost = new double[2];
        String travelCost;
        double totalCost = 0;
        int i;

        travelCost = "80.5 130.00";

        inputCost = new Scanner(travelCost);

        for(i=0; i<2; ++i) {
            cost[i] = inputCost.nextDouble();
            totalCost = totalCost + cost[i];
        }

        System.out.print("Cost: $" + totalCost);
    }
}
