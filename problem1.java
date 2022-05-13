
// variables and datatypes - math problem


public class problem1 {
    public static void main(String[] args) {
        double carSpeed = 30.0;
        double camelSpeed = 65.0;
        double scooterSpeed = 20.0;
        double walkingSpeed = 5.0;

        double carTime;
        double camelTime;
        double scooterTime;
        double walkingTime;

        double distance = 8.9 + 13.05; // distance b + e

        //distance = speed*time;
        //therefore, time = speed/distance;
        carTime = carSpeed/distance;
        camelTime = camelSpeed/distance;
        scooterTime = scooterSpeed/distance;
        walkingTime = walkingSpeed/distance;


        System.out.println("Sporky travelled for: " + distance + "km");
        
        System.out.printf("Car: %.2f", carTime );
        System.out.println(" hours");

        System.out.printf("Camel: %.2f", camelTime);
        System.out.println(" hours");

        System.out.printf("Scooter: %.2f", scooterTime);
        System.out.println(" hours");

        System.out.printf("Walking: %.2f", walkingTime);
        System.out.println(" hours");

    }
}