import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            int age = 87;
            int distance = 20;
            String transport = "camel";
            double cost = 0.0;

            if (distance<21) {
                cost = distance * 3.0;
            }
            else if (distance<30) {
                cost = distance * 4.0;
            }
            else {
                cost = distance * 6.0;
            }

            if (age<6) {
                cost = cost + 0.0;
            }
            else if (age<19) {
                cost = cost + 15.0;
            }
            else if (age<61) {
                cost = cost + 25.0;
            }
            else {
                cost = cost + 20.0;
            }

            if (transport == "car") {
                cost = cost + 2.5;
            }
            if (transport == "camel") {
                cost = cost + 5.5;
            }
            if (transport == "scooter") {
                cost = cost + 3.5;
            }
            if (transport == "walking") {
            }

            System.out.printf("Cost: $%.2f", cost);
        
        }
    
}
}