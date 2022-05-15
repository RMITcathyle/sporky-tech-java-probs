import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            Scanner inSS = null;

            String travelInfo;
            int age;
            double distance;
            double cost = 0.0;
            String transport;

            travelInfo = "87 "

            inSS = 



            if (distance<21) {
                cost = distance * 3.4;
            }
            else if (distance<30) {
                cost = distance * 4.3;
            }
            else {
                cost = distance * 6.9;
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
                cost = cost + 2.4;
            }
            if (transport == "camel") {
                cost = cost + 5.6;
            }
            if (transport == "scooter") {
                cost = cost + 3.5;
            }
            if (transport == "walking") {
            }

            System.out.print(cost);
        }
    
}
}
// tour guide costs